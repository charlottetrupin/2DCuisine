package Control;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import Model.Dimension;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller du fichier fxml dimension
 */
public class Controller {
    @FXML private TextField larg;
    @FXML private TextField lon;
    @FXML private Rectangle rect;
    @FXML private Line lineLong;
    @FXML private Line lineLarg;
    @FXML private Text textLarg;
    @FXML private Text textLong;
    @FXML private Text erreur;
    @FXML private Button equip;
    private int longueur;
    private int largeur;
    private Button b = new Button();




    /**
     * Quand l'utilisateur rentre les dimensions de sa cuisine il doit valider pour voir le resultat
     * On verifie si les caracteres rentres dans les champs correspondent bien a des chiffres
     * On utilise une classe Dimension avec une methode echelle pour gerer l'affichage
     */
    @FXML
    protected void valide(MouseEvent e) throws IOException {
        erreur.setFill(Paint.valueOf("#295676"));
        String exp = "[1-9][0-9]+";
        if(larg.getText().matches(exp) && lon.getText().matches(exp)) {
            this.largeur = Integer.parseInt(larg.getText());
            this.longueur = Integer.parseInt(lon.getText());
            Dimension dim = new Dimension(longueur, largeur);
            dim.echelle(this.rect, this.lineLong, this.lineLarg, this.textLong, this.textLarg);
        }
        else{
            erreur.setFill(Paint.valueOf("#000000"));
        }
    }

    /**
     * Quand l'utilisateur souhaite passer aux placement des equipements, il clique sur le bouton correspondant
     * Un message va apparaitre pour s'assurer qu'il en a fini avec les dimensions, si il ferme la fenetre qui a pop up, il pourra continuer de choisir les dimensions
     * Sinon, on affiche la nouvelle page correspond au fichier fxml equipement et
     * on initialise aussi les equipements tel que le rectangle representant la cuisine
     * Si l'utilisateur n'a rentre aucune dimension, par defaut, la cusine aura pour longueur et largueur 200
     */
    @FXML
    protected void equipement(MouseEvent e) throws Exception {
        Stage primaryStage = (Stage) equip.getScene().getWindow();
        b.setLayoutX(50);
        b.setLayoutY(50);
        b.setText("Validez");
        Stage newWindow = new Stage();
        newWindow.initModality(Modality.WINDOW_MODAL);
        Label label = new Label("Vous allez changer de page, si vous n'avez pas fini, fermez cette fenêtre et continuez votre choix de dimensions.");
        Label label2 = new Label ("\nSi vous avez fini de choisir vos dimensions, cliquez sur le bouton ci-dessous");
        Pane secondaryLayout = new Pane();
        secondaryLayout.getChildren().add(label);
        secondaryLayout.getChildren().add(label2);
        secondaryLayout.getChildren().add(b);
        Scene secondScene = new Scene(secondaryLayout, 600, 100);
        newWindow.setTitle("Attention");
        newWindow.setScene(secondScene);
        newWindow.initOwner(primaryStage);
        newWindow.setX(primaryStage.getX() + 350);
        newWindow.setY(primaryStage.getY() + 100);
        newWindow.show();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../Fxml/equipement.fxml"));
        Pane pane = loader.load();
        Controller2 c = loader.getController();
        Dimension dim = new Dimension(this.longueur, this.largeur);
        dim.echelle(c.getRect(),c.getLineLong(),c.getLineLarg(),c.getTextLong(),c.getTextLarg());
        pane.getChildren().set(1,c.getRect());
        pane.getChildren().set(2,c.getLineLong());
        pane.getChildren().set(3,c.getLineLarg());
        pane.getChildren().set(4,c.getTextLong());
        pane.getChildren().set(5,c.getTextLarg());
        c.setPane(pane);
        c.setLargeur(this.largeur);
        c.setLongueur(this.longueur);
        Scene myScene2 = new Scene(pane, pane.getPrefWidth()*1.5, pane.getPrefHeight()*1.5);

        b.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent actionEvent) {
                newWindow.close();
                primaryStage.setScene(myScene2);
                primaryStage.setX(primaryStage.getX());
                primaryStage.setY(primaryStage.getY());
                primaryStage.show();
            }
        });

    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLarg(int largeur){
        this.largeur = largeur;
    }
}