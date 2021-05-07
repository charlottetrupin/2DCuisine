package Control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *  Controller du fichier fxml Acceuil
 *  Sert à introduire la personne a notre application
 **/
public class ControllerAcceuil {
    @FXML private Button acceuil;

    /**
     * Si l'utilisateur clique sur le bouton acceuil, la page pour gerer les dimensions est montree
     *  On initialise aussi les valeurs de cuisine par defaut
     */
    @FXML
    protected void click(MouseEvent e) throws Exception{
        Stage primaryStage = (Stage) acceuil.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../Fxml/dimension.fxml"));
        Pane myPane = loader.load();
        ControllerDimension c = loader.getController();
        c.setLongueur(200);
        c.setLarg(200);
        Scene myScene = new Scene(myPane, myPane.getPrefWidth()*1.5,myPane.getPrefHeight()*1.5);
        primaryStage.setScene(myScene);
        primaryStage.setX(primaryStage.getX()-250);
        primaryStage.setY(primaryStage.getY()-75);
        primaryStage.show();
    }

}
