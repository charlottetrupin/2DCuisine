package Control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerAcceuil {
    @FXML private Button acceuil;

    @FXML
    protected void click(MouseEvent e) throws Exception{
        Stage primaryStage = (Stage) acceuil.getScene().getWindow();
        Pane myPane = (Pane) FXMLLoader.load(getClass().getResource("dimension.fxml"));
        Scene myScene = new Scene(myPane, myPane.getPrefWidth()*1.5,myPane.getPrefHeight()*1.5);
        primaryStage.setScene(myScene);
        primaryStage.setX(primaryStage.getX()-250);
        primaryStage.setY(primaryStage.getY()-75);
        primaryStage.show();
    }

}
