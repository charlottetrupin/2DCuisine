package Model;


import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Equipements {
    private ArrayList<Meuble> meubles;

    public Equipements(){
            meubles = new ArrayList<Meuble>();
        }

    public void addMeubles(Meuble m){
        this.meubles.add(m);
    }

    public boolean seChevauche(ImageView i, double dX, double dY) {
        for (Meuble m : this.meubles) {
            if(!m.getI().equals(i)){ // ici on verifie qu'on ne compare pas avec l'objet lui meme
                if(m.getI().intersects(i.getX() + dX, i.getY() + dY, i.getFitWidth(), i.getFitHeight())){
                    return true;
                }

            }

        }

        return false;
    }

}
