package org.example.controller.dashBoradWindowController;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class ControllerAddProduct {

    @FXML
    private AnchorPane addProductPane;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnDiscard;

    @FXML
    private Label lblProductid;

    @FXML
    private TextField txtAvailableQuantity;

    @FXML
    private TextField txtBuyingPrice;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtItemName;

    @FXML
    private TextField txtProduct;

    @FXML
    private TextField txtSellingPrice;

    @FXML
    void btnOnClickAddproduct(ActionEvent event) {

    }

    @FXML
    void btnOnClickDeleteProduct(ActionEvent event) {

    }

    @FXML
    void btnOnClickUpdateproduct(ActionEvent event) {

    }

    @FXML
    void onClickBack(ActionEvent event) throws IOException {

        URL resource = getClass().getResource("/view/DashboardWindows/inventory.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.addProductPane.getChildren().clear();
            this.addProductPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }


}
