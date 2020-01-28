package home.controllers;

import home.model.Classes.Bien;
import home.model.Classes.ImmoESI;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class RechercheController implements Initializable {

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

    public RechercheController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        date.setCellValueFactory(new PropertyValueFactory<>("Date"));
        transaction.setCellValueFactory(new PropertyValueFactory<>("Transaction"));
        titre.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        prix.setCellValueFactory(new PropertyValueFactory<>("Prix"));
        wilaya.setCellValueFactory(new PropertyValueFactory<>("Wilaya"));
        propretaire.setCellValueFactory(new PropertyValueFactory<>("Propretaire"));

        tbData.setItems(Biens);
    }

    private ObservableList<Bien> Biens = FXCollections.observableArrayList(ImmoESI.lBiens);

}
