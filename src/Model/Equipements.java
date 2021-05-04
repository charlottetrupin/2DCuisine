package Model;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Equipements {
        private ArrayList<Meuble> meubles;

        public Equipements(){
            meubles = new ArrayList<Meuble>();
        }

    public void addMeubles(Meuble m){
        this.meubles.add(m);
    }


        /* public void seChevauche(double x, double y, double fitWidth, double fitHeight) {

        for (Image image : images) {
            //if(image.getX() == x && image.getY() == y){// && image.getY() <y+fitHeight) || (image.getX() + image.getFitWidth() > x && image.getY()+image.getFitHeight() > y) ){
            //  return true;
            //}
            System.out.println("count" + images.size());
            //   System.out.println("ici:"+ image.getX());
            // System.out.println("ici1:" +image.getY());
            //System.out.println("ici2" + x);
            //System.out.println("ici3:" + y);
        }
        //return false;
    }*/

}
