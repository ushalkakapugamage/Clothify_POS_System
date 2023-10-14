package org.example.controller.dashBoradWindowController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TreeTableColumn;

public class SupplierController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnAddSupplier;

    @FXML
    private TreeTableColumn<?, ?> colBranch;

    @FXML
    private TreeTableColumn<?, ?> colCompany;

    @FXML
    private TreeTableColumn<?, ?> colContactNumber;

    @FXML
    private TreeTableColumn<?, ?> colEmail;

    @FXML
    private TreeTableColumn<?, ?> colProduct;

    @FXML
    private TreeTableColumn<?, ?> colSupplierName;

    @FXML
    private JFXTreeTableView<?> tblSupplier;

    @FXML
    void onclickAddSupplier(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
