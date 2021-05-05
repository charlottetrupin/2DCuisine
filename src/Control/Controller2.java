package Control;
import Model.Equipements;
import Model.Meuble;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller2 {
    @FXML private Rectangle rect;
    @FXML private Line lineLong;
    @FXML private Line lineLarg;
    @FXML private Text textLarg;
    @FXML private Text textLong;
    @FXML private ImageView image;
    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private ImageView image4;
    @FXML private Button button0;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    private int longueur;
    private int largeur;
    private Pane pane = new Pane();
    private Equipements equipements = new Equipements();

    @FXML
    protected void ajout(MouseEvent e) throws Exception {
        ImageView i = new ImageView();
        Meuble meuble = new Meuble(i);
        if (e.getSource().equals(button0) ){
            meuble.ajoutMeuble(i, image, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button1))
        {
            meuble.ajoutMeuble(i, image1, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button2)){
            meuble.ajoutMeuble(i, image2, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button3)){
            meuble.ajoutMeuble(i, image3, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if(e.getSource().equals(button4)){
            meuble.ajoutMeuble(i, image4, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }

        new Dragger(i,rect,meuble, equipements) ;

        i.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getClickCount() == 2) {
                i.setRotate(i.getRotate() + 90);

            }
        });

        equipements.addMeubles(meuble);
    }


    private static class Dragger {
        private double x ;
        private double y ;
        private Meuble meuble;
        private Equipements eq;

        private Rectangle rect;
        Dragger(ImageView imageView, Rectangle rec, Meuble m, Equipements eq) {
            imageView.setOnMousePressed(e -> {
                x = e.getSceneX();
                y = e.getSceneY();
                rect = rec;
                meuble = m;
                this.eq = eq;
            });
            imageView.setOnMouseDragged(e -> {
                double deltaX = e.getSceneX() - x;
                double deltaY = e.getSceneY() - y;
                if(imageView.getX()+deltaX > 0 && imageView.getY()+deltaY > 0
                        && rect.getWidth()-imageView.getFitWidth() > imageView.getX()+deltaX
                        && rect.getHeight()-imageView.getFitHeight() > imageView.getY()+deltaY){

                    if(!eq.seChevauche(imageView, deltaX, deltaY)) {
                        imageView.setX(imageView.getX() + deltaX);
                        imageView.setY(imageView.getY() + deltaY);
                        System.out.println(eq.seChevauche(imageView, deltaX, deltaY));
                        meuble.setX(imageView.getX() + deltaX);
                        meuble.setY(imageView.getY() + deltaY);
                        x = e.getSceneX();
                        y = e.getSceneY();
                    }else {
                        imageView.setX(imageView.getX() + deltaX + 2);
                        imageView.setY(imageView.getY() + deltaY + 2);
                        System.out.println(eq.seChevauche(imageView, deltaX, deltaY));
                        meuble.setX(imageView.getX() + deltaX + 2);
                        meuble.setY(imageView.getY() + deltaY + 2);
                        x = e.getSceneX();
                        y = e.getSceneY();
                    }

                }else if(imageView.getRotate()%90 == 0 && !(imageView.getRotate()%360 == 0)  ){
                    System.out.println(((imageView.getX()+e.getX()) /2) +imageView.getFitHeight() ) ;
                    System.out.println(rect.getWidth());
                    imageView.setX(imageView.getX() + deltaX);
                    imageView.setY(imageView.getY() + deltaY);
                    meuble.setX((int) imageView.getX() );
                    meuble.setY((int) imageView.getY() ) ;
                    x = e.getSceneX();
                    y = e.getSceneY();
                }
                else if(imageView.getRotate()%180 == 0 && !(imageView.getRotate()%360 == 0)){
                    imageView.setX(imageView.getX() + deltaX);
                    imageView.setY(imageView.getY() + deltaY);
                    meuble.setX((int) imageView.getX());
                    meuble.setY((int) imageView.getY());
                    x = e.getSceneX();
                    y = e.getSceneY();
                }
                else if(imageView.getRotate()%270 == 0  && !(imageView.getRotate()%360 == 0)){
                    imageView.setX(imageView.getX() + deltaX);
                    imageView.setY(imageView.getY() + deltaY);
                    meuble.setX((int) imageView.getX());
                    meuble.setY((int) imageView.getY());
                    x = e.getSceneX();
                    y = e.getSceneY();
                }

            });
        }

    }


    public Line getLineLarg() {
        return lineLarg;
    }

    public Line getLineLong() {
        return lineLong;
    }

    public Rectangle getRect() {
        return rect;
    }

    public Text getTextLarg() {
        return textLarg;
    }

    public Text getTextLong() {
        return textLong;
    }


    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }
}
