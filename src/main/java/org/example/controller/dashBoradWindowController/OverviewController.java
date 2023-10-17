package org.example.controller.dashBoradWindowController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class OverviewController implements Initializable {

    @FXML
    private AreaChart<?, ?> SalesProfitChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series series = new XYChart.Series();

        series.getData().add(new XYChart.Data("0",100));
        series.getData().add(new XYChart.Data("1",80));
        series.getData().add(new XYChart.Data("2",50));
        series.getData().add(new XYChart.Data("3",150));
        series.getData().add(new XYChart.Data("4",120));
        series.getData().add(new XYChart.Data("5",120));
        series.getData().add(new XYChart.Data("6",200));
        series.getData().add(new XYChart.Data("7",250));
        series.getData().add(new XYChart.Data("8",60));
        series.getData().add(new XYChart.Data("9",35));
        series.getData().add(new XYChart.Data("10",100));
        series.getData().add(new XYChart.Data("11",110));
        series.getData().add(new XYChart.Data("12",90));



        XYChart.Series series1 = new XYChart.Series();

        series1.getData().add(new XYChart.Data("0",50));
        series1.getData().add(new XYChart.Data("1",60));
        series1.getData().add(new XYChart.Data("2",100));
        series1.getData().add(new XYChart.Data("3",200));
        series1.getData().add(new XYChart.Data("4",120));
        series1.getData().add(new XYChart.Data("5",90));
        series1.getData().add(new XYChart.Data("6",50));
        series1.getData().add(new XYChart.Data("7",120));
        series1.getData().add(new XYChart.Data("8",230));
        series1.getData().add(new XYChart.Data("9",125));
        series1.getData().add(new XYChart.Data("10",300));
        series1.getData().add(new XYChart.Data("11",150));
        series1.getData().add(new XYChart.Data("12",100));

        SalesProfitChart.getData().add(series);
        SalesProfitChart.getData().add(series1);

    }
}
