package home;

import home.model.Classes.ImmoESI;
import home.model.Classes.Proprietaire;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import home.model.Service;;

public class Main extends Application {

    Service service = new Service();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/Login.fxml"));
        primaryStage.setTitle("ImmoESI");
        primaryStage.getIcons().add(new Image("/home/icons/icon.png"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    // you can download the glyph browser - link provided.
    public static void main(String[] args) {
        launch(args);
    }
}
