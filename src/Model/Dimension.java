package Model;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Dimension {
    private int longueur;
    private int largeur;

    public Dimension(int lon, int larg) {
        this.longueur = lon;
        this.largeur = larg;
    }

    public float getLargeur() {
        return largeur;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void echelle(Rectangle rect, Line l1, Line l2, Text t1, Text t2) {
        rect.setStroke(Paint.valueOf("BLACK"));
        rect.setFill(Paint.valueOf("WHITE"));
        t1.setText(String.valueOf(this.longueur));
        t2.setText(String.valueOf(this.largeur));
        l1.setStroke(Paint.valueOf("BLACK"));
        l2.setStroke(Paint.valueOf("BLACK"));
        if (this.longueur > this.largeur) {
            double width = (600. / this.longueur) * this.longueur;
            double height = (600. / this.longueur) * this.largeur;
            rect.setWidth(width);
            rect.setHeight(height);
            l1.setEndX(l1.getStartX() + width);
            l2.setStartY(l2.getEndY() + height);
            t1.setX(l1.getStartX()+ width/2);
            t2.setY((l2.getEndY()+height)/7);
        } else {
            double width = (400. / this.longueur) * this.longueur;
            double height = (400. / this.longueur) * this.largeur;
            rect.setWidth(width);
            rect.setHeight(height);
            l1.setEndX(l1.getStartX() + width);
            l2.setStartY(l2.getEndY() + height);
            t1.setX(l1.getStartX()+ width/2);
            t2.setY(l1.getEndY()+height/4);
        }
    }

}
