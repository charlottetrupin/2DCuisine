package Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Meuble {
    private double longueur;
    private double largeur;
    private double x;
    private double y;
    private ImageView i;

    public Meuble(ImageView i ) {
        this.x = i.getX();
        this.y = i.getY();
        this.i = i;
        this.longueur = i.getFitWidth();
        this.largeur = i.getFitHeight();

    }

    public void ajoutMeuble(ImageView i, ImageView i1, Rectangle rect, int longCuisine, int largCuisine){
        i.setLayoutY(rect.getLayoutY() + 1);
        i.setLayoutX(rect.getLayoutX() + 1);
        i.setX(rect.getX());
        i.setY(rect.getY());
        i.setImage(i1.getImage());
        if (longCuisine >= largCuisine) {
            this.longueur = ((600. / longCuisine) * i1.getFitWidth());
            this.largeur = ((600. / longCuisine)* i1.getFitHeight());
            i.setPreserveRatio(true);
            i.setFitHeight(this.largeur);
            i.setFitWidth(this.longueur);
        }
        else {
            this.largeur = ((800. / largCuisine) * i1.getFitWidth());
            this.longueur = ((600. / largCuisine) * i1.getFitHeight());
            i.setPreserveRatio(true);
            i.setFitHeight(this.largeur);
            i.setFitWidth(this.longueur);
        }

    }

    public ImageView getI() {
        return i;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }
}
