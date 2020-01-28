package home.controllers;

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

public class Controller implements Initializable {

    @FXML
    private Button btnAcceuil;

    @FXML
    private Button btnGérer;

    @FXML
    private Button btn_Timetable;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnTransactions;

    @FXML
    private Button btnRecherche;

    // my bad - the freaking mouse event
    @FXML
    private void handleButtonClicks(javafx.event.ActionEvent mouseEvent) {
        if (mouseEvent.getSource() == btnAcceuil) {
            loadStage("/home/fxml/Acceuil.fxml");
        } else if (mouseEvent.getSource() == btnGérer) {
            loadStage("/home/fxml/OnBoard.fxml");
        } else if (mouseEvent.getSource() == btn_Timetable) {
            loadStage("/home/fxml/Archive.fxml");
        } else if (mouseEvent.getSource() == btnRecherche) {
            loadStage("/home/fxml/Recherche.fxml");
        } else if (mouseEvent.getSource() == btnTransactions) {
            loadStage("/home/fxml/Transactions.fxml");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

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
}
