/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.controllers;

//! com.mysql.jdbc.*  present in downloads, mysql connector, problem with integrating it!
import java.net.URL;
import java.util.ResourceBundle;

import home.model.Classes.Transactions.*;
import home.model.Enums.Plex;
import home.model.Enums.StatusJuridique;
import home.model.Enums.Wilayas;
import home.model.Interfaces.Transaction;
import home.model.Classes.*;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.collections.FXCollections;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import home.model.Classes.*;

/**
 * FXML Controller class
 *
 * @author oXCToo
 */
public class GestionController implements Initializable {

    @FXML
    private TextField txtTitre;
    @FXML
    private TextField txtPrix;
    @FXML
    private TextField txtProprietaire;
    @FXML
    private DatePicker txtDOB;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnSupp;
    @FXML
    private Button btnArchiver;
    @FXML
    private ComboBox<String> txtType;
    @FXML
    Label lblStatus;

    @FXML
    private TableView<Bien> tbData;
    @FXML
    public TableColumn<Bien, Integer> date;

    @FXML
    public TableColumn<Bien, Transaction> transaction;

    @FXML
    public TableColumn<Bien, String> titre;

    @FXML
    public TableColumn<Bien, Double> prix;

    @FXML
    public TableColumn<Bien, Wilayas> wilaya;

    @FXML
    public TableColumn<Bien, Proprietaire> propretaire;

    @FXML
    private ComboBox<String> txtTrasaction;

    /**
     * Initializes the controller class.
     */

    // public GestionController() {
    // connection = (Connection) ConnectionUtil.conDB();
    // }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        txtType.getItems().addAll("Appartement", "Terrain", "Maison");
        txtType.getSelectionModel().select("Maison");
        //txtTrasaction.getItems().addAll("Appartement", "Terrain", "Maison");
        //txtTrasaction.getSelectionModel().select("Maison");
        loadStudents();

    }

    @FXML
    private void HandleEvents(MouseEvent mouseEvent) {
        // check if not empty
        if (mouseEvent.getSource() == btnSave) {
            if (txtProprietaire.getText().isEmpty() || txtTitre.getText().isEmpty() || txtPrix.getText().isEmpty()
                    || txtDOB.getValue().equals(null)) {
                lblStatus.setTextFill(Color.TOMATO);
                lblStatus.setText("Enter all details");
            } else {
                saveData();
                Biens = FXCollections.observableArrayList(ImmoESI.lBiens);
                tbData.setItems(Biens);
            }

        } else if (mouseEvent.getSource() == btnSupp) {
            Bien b = tbData.getSelectionModel().getSelectedItem();
            ImmoESI.Supprimer(b);
            Biens = FXCollections.observableArrayList(ImmoESI.lBiens);
            tbData.setItems(Biens);
        } else if (mouseEvent.getSource() == btnArchiver) {
            Bien b = tbData.getSelectionModel().getSelectedItem();
            ImmoESI.Archiver(b);

            Biens = FXCollections.observableArrayList(ImmoESI.lBiens);
            tbData.setItems(Biens);
        }

    }

    private void clearFields() {
        txtTitre.clear();
        txtPrix.clear();
        txtProprietaire.clear();
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

    private String saveData() {
        try {

            if (txtType.getValue().toString() == "Maison") {
                ImmoESI.lBiens.add(new Maison("", Wilayas.Alger, 120.00,
                        new Proprietaire(txtProprietaire.getText(), "", "", "", ""), new Vente(),
                        Integer.parseInt(txtPrix.getText()), true, "N/A", "N/A", "", Wilayas.Alger, 0, false, 0, false,
                        false, true, 200));
            }
            if (txtType.getValue().toString() == "Appartement") {
                ImmoESI.lBiens.add(new Appartement("", Wilayas.Alger, 100.00,
                        new Proprietaire(txtProprietaire.getText(), "", "", "", ""), new Location(),
                        Integer.parseInt(txtPrix.getText()), true, "N/A", "N/A", "", Wilayas.Alger, 3, false, 1,
                        Plex.Simplex, false)

                );
            }
            if (txtType.getValue().toString() == "Terrain") {
                ImmoESI.lBiens.add(new Terrain("", Wilayas.Alger, 120.00,
                        new Proprietaire(txtProprietaire.getText(), "", "", "", ""), new Vente(),
                        Integer.parseInt(txtPrix.getText()), true, "N/A", "N/A", "", Wilayas.Alger,
                        StatusJuridique.Acte_notarié, 3)

                );
            }

            lblStatus.setTextFill(Color.GREEN);
            lblStatus.setText("Added Successfully");

            // clear fields
            clearFields();
            return "Success";

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            lblStatus.setTextFill(Color.TOMATO);
            lblStatus.setText(ex.getMessage());
            return "Exception";
        }
    }

}
