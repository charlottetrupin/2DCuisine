package Model;

import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * Class pour controler les dimensions de la cuisine
 */
public class Dimension {
    private int longueur;
    private int largeur;


    public Dimension(int lon, int larg) {
        this.longueur = lon;
        this.largeur = larg;
    }


    /**
     * Fonction qui permet de faire l'echelle du rectangle en fonction des dimensions donnees
     * On set aussi les valeurs des differents elements permettant a l'utilisateur de mieux comprendre
     * @param rect le rectangle qui represente notre cuisine
     * @param l1 correspond a la ligne reprensentant la longueur du rectangle
     * @param l2 correspond a la largueur representant la largueur du rectangle
     * @param t1 pour afficher la longueur du rectangle
     * @param t2 pour afficher la largueur du rectangle
     */
    public void echelle(Rectangle rect, Line l1, Line l2, Text t1, Text t2) {
        t1.setText(String.valueOf(this.longueur));
        t2.setText(String.valueOf(this.largeur));
        if (this.longueur >= this.largeur) {
            double width = (600. / this.longueur) * this.longueur;
            double height = (600. / this.longueur) * this.largeur;
            rect.setWidth(width);
            rect.setHeight(height);
            l1.setEndX(l1.getStartX() + width);
            l2.setStartY(l2.getEndY() + height);
            t1.setX(l1.getStartX()+ width/2);
            t2.setY((l2.getEndY()+height)/6);
        } else {
            double width = (800. / this.largeur) * this.longueur;
            double height = (600. / this.largeur) * this.largeur;
            rect.setWidth(width);
            rect.setHeight(height);
            l1.setEndX(l1.getStartX() + width);
            l2.setStartY(l2.getEndY() + height);
            t1.setX(l1.getStartX()+ width/2);
            t2.setY(l1.getEndY()+height/4);
        }
    }

}
