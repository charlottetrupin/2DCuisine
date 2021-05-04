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
        Meuble meuble = new Meuble(this.longueur, this.largeur);
        if (e.getSource().equals(button0) ){
            meuble.ajoutMeuble(i, image, rect);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button1))
        {
            meuble.ajoutMeuble(i, image1, rect);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button2)){
            meuble.ajoutMeuble(i, image2, rect);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button3)){
            meuble.ajoutMeuble(i, image3, rect);
            pane.getChildren().add(i);
        }
        else if(e.getSource().equals(button4)){
            meuble.ajoutMeuble(i, image4, rect);
            pane.getChildren().add(i);
        }
        i.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                //if()
                System.out.println(i.getY());
                System.out.println(i.getX());
                //i.setX();
                //  i.setRotate(90);
                System.out.println(i.getY());
                System.out.println(i.getX());

            }
        });
        i.setOnMouseDragged(new EventHandler<>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(mouseEvent.getX() > 0 && mouseEvent.getY() > 0 && rect.getWidth()-i.getFitWidth() > mouseEvent.getX()
                        && rect.getHeight()-i.getFitHeight() > mouseEvent.getY()) {
                    i.setX(mouseEvent.getX());
                    i.setY(mouseEvent.getY());
                    //equipement.seChevauche(mouseEvent.getX(), mouseEvent.getY(), i.getFitWidth(), i.getFitHeight());
                }
            }
        });
        equipements.addMeubles(meuble);
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
