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

        series.getData().add(new XYChart.Data("0",23));
        series.getData().add(new XYChart.Data("1",30));
        series.getData().add(new XYChart.Data("3",50));
        series.getData().add(new XYChart.Data("6",40));
        series.getData().add(new XYChart.Data("7",60));
        series.getData().add(new XYChart.Data("10",74));
        series.getData().add(new XYChart.Data("15",120));
        series.getData().add(new XYChart.Data("25",250));

        XYChart.Series series1 = new XYChart.Series();

        series1.getData().add(new XYChart.Data("0",200));
        series1.getData().add(new XYChart.Data("1",140));
        series1.getData().add(new XYChart.Data("3",130));
        series1.getData().add(new XYChart.Data("6",95));
        series1.getData().add(new XYChart.Data("7",97));
        series1.getData().add(new XYChart.Data("10",170));
        series1.getData().add(new XYChart.Data("15",50));
        series1.getData().add(new XYChart.Data("25",45));

        SalesProfitChart.getData().add(series);
        SalesProfitChart.getData().add(series1);

    }
}
