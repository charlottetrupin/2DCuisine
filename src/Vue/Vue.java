package Vue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Vue extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane start = (Pane) FXMLLoader.load(getClass().getResource("../Control/acceuil.fxml"));
        Scene welcome = new Scene(start,start.getPrefWidth(),start.getPrefHeight());
        primaryStage.setResizable(false);
        primaryStage.setTitle("Cuisine2D");
        primaryStage.setScene(welcome);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
