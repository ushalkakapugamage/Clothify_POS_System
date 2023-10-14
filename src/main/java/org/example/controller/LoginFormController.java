package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    private Stage loginStage;

    public void setStage(Stage stage){
        this.loginStage =stage;
    }

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private ImageView image;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void btnSignUpOnClick(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/signup_form.fxml");

        if (resource != null) {
            FXMLLoader loader = new FXMLLoader(resource);
            Parent load = loader.load(); // Load FXML and get root

            this.anchorPane.getChildren().clear();
            this.anchorPane.getChildren().add(load);

            SignUpFormController signupController = loader.getController();
            signupController.setStage(loginStage);
        } else {
            System.out.println("FXML file not found: signup_form.fxml");
        }
    }


    @FXML
    void onclickLogin(ActionEvent event) throws IOException {
        loginStage.close();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }






}
