package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpFormController {
    private Stage loginStage;
    public void setStage(Stage stage){
        this.loginStage =stage;
    }

    @FXML
    private JFXButton btnSignUp;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtPassword1;

    @FXML
    private TextField txtPassword11;

    @FXML
    void onclickSignUp(ActionEvent event) throws IOException {
        loginStage.close();
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
        stage.setScene(new Scene(root));
        stage.show();

    }

}
