package Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Meuble {
    private int longueur;
    private int largeur;

    public Meuble(int lon, int larg) {
        this.longueur = lon;
        this.largeur = larg;
    }

    public void ajoutMeuble(ImageView i, ImageView i1, Rectangle rect){
        i.setLayoutY(rect.getLayoutY() + 1);
        i.setLayoutX(rect.getLayoutX() + 1);
        i.setX(rect.getX());
        i.setY(rect.getY());
        i.setImage(i1.getImage());
        if (this.longueur >= this.largeur) {
            double width = ((600. / this.longueur) * i1.getFitWidth());
            double height = ((600. / this.longueur)* i1.getFitHeight());
            i.setPreserveRatio(true);
            i.setFitHeight(height);
            i.setFitWidth(width);
        }
        else {
            double width = (800. / this.largeur) * i1.getFitWidth();
            double height = (600. / this.largeur) * i1.getFitHeight();
            i.setPreserveRatio(true);
            i.setFitHeight(height);
            i.setFitWidth(width);
        }

    }




}
