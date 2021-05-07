package Model;

import javafx.scene.image.ImageView;
import java.util.ArrayList;

/**
 * Classe qui s'occupe de la liste des equipements de la cuisine, pour verifier les chevauchement et supprimer le meuble de la liste
 */
public class Equipements {
    private ArrayList<Meuble> meubles;

    public Equipements(){
        meubles = new ArrayList<Meuble>();
    }

    public void addMeubles(Meuble m){
        this.meubles.add(m);
    }

    /**
     * Grace a la methode intersects, on peut regarder si deux meubles ne se chevauchent pas
     */
    public boolean seChevauche(ImageView i, double dX, double dY) {
        for (Meuble m : this.meubles) {
            if(!m.getI().equals(i)){ // ici on verifie qu'on ne compare pas avec l'objet avec lui meme
                if(m.getI().intersects(i.getX() + dX, i.getY() + dY, i.getFitWidth(), i.getFitHeight())){
                    return true;
                }
            }
        }
        return false;
    }


    public void supprimeMeuble(Meuble m){
        this.meubles.remove(m);
    }

}