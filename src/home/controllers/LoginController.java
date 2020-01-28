package home.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import home.model.Classes.ImmoESI;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author oXCToo
 */
public class LoginController implements Initializable {

    @FXML
    private Label lblErrors;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnSignin;
    @FXML
    private Button btnSignup;

    /// --
    Connection con = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @FXML
    public void handleButtonAction(MouseEvent event) {

        if (event.getSource() == btnSignin) {
            // login here
            if (logIn().equals("Success")) {
                // if (txtUsername.getText() == "admin" & txtPassword.getText() == "admin") {
                try {

                    loadStage("/home/fxml/Home.fxml");

                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
        if (event.getSource() == btnSignup) {
            // login here
                    loadStage("/home/fxml/HomeUser.fxml");
            }
        }
    
    
    // if (txtUsername.getAccessibleText() == "user" || txtPassword.getText() ==
    // "user") {
    // try {
    // loadStage("/home/fxml/HomeUser.fxml");
    // } catch (Exception ex) {
    // System.err.println(ex.getMessage());
    // }

    // }
    // }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        lblErrors.setTextFill(Color.GREEN);
        lblErrors.setText("Welcome");

    }

    public LoginController() {

    }

    // we gonna use string to check for status
    private String logIn() {
        String status = "Success";
        String email = txtUsername.getText();
        String password = txtPassword.getText();
        if (email.isEmpty() || password.isEmpty()) {
            setLblError(Color.TOMATO, "Veuillez Entrer Vos Informations!");
            status = "Error";
        } else {
            try {

                if (email.compareTo(ImmoESI.admin.getE_mail()) == 0
                        && password.compareTo(ImmoESI.admin.getPassword()) == 0) {
                    setLblError(Color.GREEN, "Login Successful..Redirecting..");
                } else {
                    setLblError(Color.TOMATO, "Impossible de Se Connecter");
                    status = "Error";
                }
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                status = "Exception";
            }
        }

        return status;
    }

    private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image("/home/icons/icon.png"));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void setLblError(Color color, String text) {
        lblErrors.setTextFill(color);
        lblErrors.setText(text);
        System.out.println(text);
    }
}
