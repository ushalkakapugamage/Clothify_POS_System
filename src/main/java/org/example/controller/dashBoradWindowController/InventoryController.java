package org.example.controller.dashBoradWindowController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class InventoryController {

    @FXML
    private JFXButton btnAddProduct;

    @FXML
    private TreeTableColumn<?, ?> colAvailability;

    @FXML
    private TreeTableColumn<?, ?> colBoughtQuantity;

    @FXML
    private TreeTableColumn<?, ?> colBuyingPrice;

    @FXML
    private TreeTableColumn<?, ?> colProduct;

    @FXML
    private TreeTableColumn<?, ?> colSellingPrice;

    @FXML
    private TreeTableColumn<?, ?> colSoldItem;

    @FXML
    private AnchorPane dashBoardPane;

    @FXML
    private JFXTreeTableView<?> tblProduct;

    @FXML
    void onclickAddproduct(ActionEvent event) throws IOException {
        System.out.println("hi");
        URL resource = getClass().getResource("/view/DashboardWindows/addProduct.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.dashBoardPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }

}
