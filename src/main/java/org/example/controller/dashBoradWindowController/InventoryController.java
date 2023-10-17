package org.example.controller.dashBoradWindowController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

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
    void onclickAddSupplier(ActionEvent event) {

    }

}
