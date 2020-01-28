package home.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import home.model.Classes.Bien;
import home.model.Classes.ImmoESI;
import home.model.Classes.Recherche;
import home.model.Classes.Filtres.*;
import home.model.Interfaces.Transaction;

public class ArchiveController implements Initializable {

    @FXML
    private TextField search1;

    @FXML
    private TextField search2;

    @FXML
    private TextField search3;

    @FXML
    private TextField search4;

    @FXML
    private TextField search5;

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


    public ArchiveController() {

    }

    @FXML
    private void HandleEvents(MouseEvent event) {
        Recherche recherche = new Recherche();
        if (event.getSource() == search1) {
            recherche.prixmin = Integer.parseInt(search1.getText());
            recherche.prixmax = Integer.parseInt(search2.getText());
        } else if (event.getSource() == search2) {
        } else if (event.getSource() == search3) {
        } else if (event.getSource() == search4) {
        } else if (event.getSource() == search5) {
        }
        Biens = FXCollections.observableArrayList(new FiltreParPrix().Filtrer(ImmoESI.lBiens, recherche));
        tbData.setItems(Biens);
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
        // tbData.getItems().stream()
        // .filter(item -> item.getId() == searchId)
        // .findAny()
        // .ifPresent(item -> {
        // table.getSelectionModel().select(item);
        // table.scrollTo(item);
        // });
    }

    private ArrayList<Bien> data = new ArrayList<Bien>();

    private ObservableList<Bien> Biens = FXCollections.observableArrayList(ImmoESI.archive);
}
