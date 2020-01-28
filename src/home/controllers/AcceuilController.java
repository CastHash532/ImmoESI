package home.controllers;

import home.model.Classes.Transactions.*;
import home.model.Enums.Plex;
import home.model.Enums.Wilayas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import home.model.Classes.*;

import java.net.URL;
import java.util.ResourceBundle;

public class AcceuilController implements Initializable {

    @FXML
    private TableView<Bien> tbData;
    @FXML
    public TableColumn<Bien, Integer> date;

    @FXML
    public TableColumn<Bien, Integer> transaction;

    @FXML
    public TableColumn<Bien, Integer> titre;

    @FXML
    public TableColumn<Bien, Integer> prix;

    @FXML
    public TableColumn<Bien, String> wilaya;

    @FXML
    public TableColumn<Bien, String> propretaire;
    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        loadChart();
        loadStudents();
    }

    private void loadChart() {

        PieChart.Data slice1 = new PieChart.Data("Appartements", 21);
        PieChart.Data slice2 = new PieChart.Data("Maisons", 67);
        PieChart.Data slice3 = new PieChart.Data("Terrains", 36);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);

    }

    private ObservableList<Bien> Biens = FXCollections.observableArrayList(ImmoESI.lBiens);

    private void loadStudents() {
        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        transaction.setCellValueFactory(new PropertyValueFactory<>("Transaction"));
        titre.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        prix.setCellValueFactory(new PropertyValueFactory<>("Prix"));
        wilaya.setCellValueFactory(new PropertyValueFactory<>("Wilaya"));
        propretaire.setCellValueFactory(new PropertyValueFactory<>("Propretaire"));

        tbData.setItems(Biens);
    }

}
