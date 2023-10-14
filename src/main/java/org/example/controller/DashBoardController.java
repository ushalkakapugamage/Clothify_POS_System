package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController implements Initializable {

    @FXML
    private JFXButton btn;

    @FXML
    private JFXButton btnEmployee;

    @FXML
    private JFXButton btnOverview;

    @FXML
    private JFXButton btnReports;

    @FXML
    private JFXButton btnSalesOrder;

    @FXML
    private JFXButton btnSupplier;

    @FXML
    private AnchorPane dashBoardPane;

    @FXML
    private Pane mainNavBar;

    @FXML
    void onclickOpenEmployee(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/DashboardWindows/employee.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.dashBoardPane.getChildren().clear();
            this.dashBoardPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }

    @FXML
    void onclickOpenOverview(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/DashboardWindows/overview.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.dashBoardPane.getChildren().clear();
            this.dashBoardPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }
    }

    @FXML
    void onclickOpenReports(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/DashboardWindows/reports.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.dashBoardPane.getChildren().clear();
            this.dashBoardPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }

    @FXML
    void onclickOpenSalesOrder(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/DashboardWindows/salesOrder.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.dashBoardPane.getChildren().clear();
            this.dashBoardPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }

    @FXML
    void onclickOpenSupplier(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/DashboardWindows/supplier.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.dashBoardPane.getChildren().clear();
            this.dashBoardPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }

    @FXML
    void onclickOpeninventory(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("/view/DashboardWindows/inventory.fxml");

        if (resource != null){
            Parent load = FXMLLoader.load(resource);
            this.dashBoardPane.getChildren().clear();
            this.dashBoardPane.getChildren().add(load);
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        URL resource = getClass().getResource("/view/DashboardWindows/overview.fxml");

        if (resource != null) {
            Parent load = null;
            try {
                load = FXMLLoader.load(resource);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            this.dashBoardPane.getChildren().clear();
            this.dashBoardPane.getChildren().add(load);
        } else {
            System.out.println("FXML file not found: overview.fxml");
        }
    }

}
