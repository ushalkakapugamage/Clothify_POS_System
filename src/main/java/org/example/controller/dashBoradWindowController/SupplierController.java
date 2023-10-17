package org.example.controller.dashBoradWindowController;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTreeTableView;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import org.example.dao.SupplierEntity;
import org.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class SupplierController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnAddSupplier;

    @FXML
    private TreeTableColumn colBranch;

    @FXML
    private TreeTableColumn colCompany;

    @FXML
    private TreeTableColumn colContactNumber;

    @FXML
    private TreeTableColumn colEmail;

    @FXML
    private TreeTableColumn colProduct;

    @FXML
    private TreeTableColumn colSupplierName;

    @FXML
    private JFXTreeTableView tblSupplier;

    @FXML
    private AnchorPane dashBoardPane;



    @FXML
    void OnClickAddSupplier(ActionEvent event) throws IOException {
        System.out.println("hi");
        URL resource = getClass().getResource("../../../../view/DashboardWindows/addSupplier.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.dashBoardPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colSupplierName.setCellValueFactory(new TreeItemPropertyValueFactory<>("supplierName"));
        colProduct.setCellValueFactory(new TreeItemPropertyValueFactory<>("product"));
        colContactNumber.setCellValueFactory(new TreeItemPropertyValueFactory<>("contactNumber"));
        colEmail.setCellValueFactory(new TreeItemPropertyValueFactory<>("email"));
        colCompany.setCellValueFactory(new TreeItemPropertyValueFactory<>("company"));
        colBranch.setCellValueFactory(new TreeItemPropertyValueFactory<>("branch"));

        loadTable();


    }

    private void loadTable() {


        Session session = HibernateUtil.getSession();
        Query<SupplierEntity> query = session.createQuery("FROM SupplierEntity", SupplierEntity.class);
        List<SupplierEntity> list = query.getResultList();
        ObservableList<SupplierEntity> supplierList = FXCollections.observableArrayList();
        for (SupplierEntity supplierEntity : list) {
            supplierList.add(supplierEntity);
        }
        TreeItem<SupplierEntity> treeItem = new RecursiveTreeItem<>(supplierList, RecursiveTreeObject::getChildren);
        tblSupplier.setRoot(treeItem);
        tblSupplier.setShowRoot(false);

    }



}
