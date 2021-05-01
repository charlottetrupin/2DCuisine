package Vue;
import Model.Dimension;
import Model.Equipement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import Control.Controller;
import javafx.scene.shape.Rectangle;
import java.awt.*;

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
