package org.example.controller.dashBoradWindowController;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.example.dao.SupplierEntity;
import org.example.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerAddSupplier implements Initializable {

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnDiscard;

    @FXML
    private Label lblSupplierID;

    @FXML
    private TextField txtBranch;

    @FXML
    private TextField txtBuyingPrice;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtCompany;

    @FXML
    private TextField txtContactNumber;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtProduct;

    @FXML
    private TextField txtSupplierName;

    @FXML
    private AnchorPane addSupplierPane;

    @FXML
    void btnOnClickAddSupplier(ActionEvent event) {
        System.out.println();

        SupplierEntity supplierEntity = new SupplierEntity(Integer.parseInt(lblSupplierID.getText().substring(1)),txtSupplierName.getText(),txtProduct.getText(),txtCategory.getText(),Double.parseDouble(txtBuyingPrice.getText()),Integer.parseInt(txtContactNumber.getText()),txtEmail.getText(),txtCompany.getText(),txtBranch.getText());
        System.out.println(supplierEntity);
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        try {

            session.save(supplierEntity);
            transaction.commit();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Successfull");
            alert.setHeaderText("Supplier saved successfully");

            alert.showAndWait();

        } catch (Exception e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error Saving Supplier");
            alert.setContentText("An error occurred while saving the supplier. Please try again.");
            alert.showAndWait();
        }

    }

    @FXML
    void btnOnClickDiscardSupplier(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/DashboardWindows/supplier.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.addSupplierPane.getChildren().clear();
            this.addSupplierPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
           generateID();
    }

    private void generateID() {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM SupplierEntity ORDER BY id DESC");
        List<SupplierEntity> resultList = query.getResultList();
        try {
            int latestId = resultList.get(0).getId();
            String formattedId = String.format("S%03d", latestId + 1);
            transaction.commit();
            lblSupplierID.setText(String.valueOf(formattedId));
        }catch (IndexOutOfBoundsException e){
            lblSupplierID.setText("S001");
        }
    }
}
