package Control;
import Model.Equipements;
import Model.Meuble;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Controller du fichier fxml equipement
 */
public class ControllerEquipement {
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
    @FXML private ImageView image5;
    @FXML private ImageView image6;
    @FXML private ImageView image7;
    @FXML private ImageView image8;
    @FXML private ImageView image9;
    @FXML private ImageView image10;
    @FXML private ImageView image11;
    @FXML private ImageView image12;
    @FXML private ImageView image13;
    @FXML private ImageView image14;
    @FXML private Button button0;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button8;
    @FXML private Button button9;
    @FXML private Button button10;
    @FXML private Button button11;
    @FXML private Button button12;
    @FXML private Button button13;
    @FXML private Button button14;
    @FXML private Button suppr;
    private int longueur;
    private int largeur;
    private Pane pane = new Pane();
    private Equipements equipements = new Equipements();

    /**
     * Ajout d'un equipement a la cuisine, appel de la classe Meuble qui s'occupe de creer le meuble correspondant a celui choisi
     * On regarde d'abord quel bouton correspond a l'appel pour ensuite afficher l'image correspondante
     * C'est aussi ici qu'on les rotations du meuble, sa suppression de la cuisine mais aussi qu'on initialise notre classe Dragger qui permet le deplacement
     * Enfin on ajoute le meuble a une arraylist de la classe Equipements repertoriant tous les meubles de la cuisine de l'utilisateur
     */
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
        else if(e.getSource().equals(button5)){
            meuble.ajoutMeuble(i, image5, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if(e.getSource().equals(button6)){
            meuble.ajoutMeuble(i, image6, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button7))
        {
            meuble.ajoutMeuble(i, image7, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button8)){
            meuble.ajoutMeuble(i, image8, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if (e.getSource().equals(button9)){
            meuble.ajoutMeuble(i, image9, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if(e.getSource().equals(button10)){
            meuble.ajoutMeuble(i, image10, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if(e.getSource().equals(button11)){
            meuble.ajoutMeuble(i, image11, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if(e.getSource().equals(button12)){
            meuble.ajoutMeuble(i, image12, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if(e.getSource().equals(button13)){
            meuble.ajoutMeuble(i, image13, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }
        else if(e.getSource().equals(button14)){
            meuble.ajoutMeuble(i, image14, rect, this.longueur, this.largeur);
            pane.getChildren().add(i);
        }

        new Dragger(i,rect,meuble, equipements) ;
        /*
         Quand l'utilisateur veut supprimer un meuble, il clique dessus,
         ce meuble s'affiche brievement en gris, puis l'utilisateur clique sur le bouton supprimer et le meuble selectionner s'affichera en gris jusqu'à sa suppression
         un message va s'afficher pour s'assurer que l'utilisateur veut bien supprimer cet element, il a la possibilite de valider son choix ou de fermer la fenetre
         */
        i.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getClickCount() == 2) {
                i.setRotate(i.getRotate() + 90);

            }
            suppr.setOnMouseClicked(ms -> {
                ColorAdjust colorAdjust = new ColorAdjust();
                colorAdjust.setContrast(-0.5);
                i.setEffect(colorAdjust);
                Stage primaryStage = (Stage) pane.getScene().getWindow();
                    Stage newWindow = new Stage();
                    Button b = new Button();
                    b.setLayoutX(50);
                    b.setLayoutY(50);
                    b.setText("Validez");
                    newWindow.initModality(Modality.WINDOW_MODAL);
                    Label label = new Label("Etes vous sûr de vouloir supprimer ce meuble ? ");
                    Pane secondaryLayout = new Pane();
                    secondaryLayout.getChildren().add(label);
                    secondaryLayout.getChildren().add(b);
                    Scene secondScene = new Scene(secondaryLayout, 260, 100);
                    newWindow.setTitle("Suppression");
                    newWindow.setScene(secondScene);
                    newWindow.initOwner(primaryStage);
                    newWindow.setX(primaryStage.getX() + 700);
                    newWindow.setY(primaryStage.getY() + 100);
                    newWindow.show();
                    b.setOnMouseClicked(ms2 -> {
                        equipements.supprimeMeuble(meuble);
                        pane.getChildren().remove(i);
                        newWindow.hide();
                    });
                    newWindow.setOnCloseRequest(new EventHandler<WindowEvent>() {
                        @Override
                        public void handle(WindowEvent windowEvent) {
                            colorAdjust.setContrast(0);
                            i.setEffect(colorAdjust);
                        }
                    });
            });
        });

        equipements.addMeubles(meuble);
    }


    /**
     * Une classe qui gere le deplacement du meuble, sa superposition avec d'autres meubles et son depassement des dimensions de la cuisine
     * Les depassements ne se font pas tres bien quand il y a eu rotation du meuble, possible depassement
     */
    private static class Dragger {
        private double x ;
        private double y ;
        private Meuble meuble;
        private Equipements eq;
        private ColorAdjust colorAdjust = new ColorAdjust();


        private Rectangle rect;
        Dragger(ImageView imageView, Rectangle rec, Meuble m, Equipements eq) {
            imageView.setOnMousePressed(e -> {
                colorAdjust.setContrast(-0.5);
                x = e.getSceneX();
                y = e.getSceneY();
                rect = rec;
                meuble = m;
                this.eq = eq;
            });
            imageView.setOnMouseDragged(e -> {
                imageView.setEffect(colorAdjust);
                double deltaX = e.getSceneX() - x;
                double deltaY = e.getSceneY() - y;
                /*
                Ici on fait des tests pour verifier si on deplace notre meuble, il ne sort pas de la cuisine et ne se superpose pas
                 */
                if(imageView.getX()+deltaX > 0 && imageView.getY()+deltaY > 0
                        && rect.getWidth()-imageView.getFitWidth() > imageView.getX()+deltaX
                        && rect.getHeight()-imageView.getFitHeight() > imageView.getY()+deltaY){
                    if(!eq.seChevauche(imageView, deltaX, deltaY)) {
                        imageView.setX(imageView.getX() + deltaX);
                        imageView.setY(imageView.getY() + deltaY);
                        meuble.setX(imageView.getX() + deltaX);
                        meuble.setY(imageView.getY() + deltaY);
                        x = e.getSceneX();
                        y = e.getSceneY();
                    }else {
                        imageView.setX(imageView.getX() + deltaX + 2);
                        imageView.setY(imageView.getY() + deltaY + 2);
                        meuble.setX(imageView.getX() + deltaX + 2);
                        meuble.setY(imageView.getY() + deltaY + 2);
                        x = e.getSceneX();
                        y = e.getSceneY();
                    }

                }else if(imageView.getRotate()%90 == 0 && !(imageView.getRotate()%360 == 0)  ){
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
            imageView.setOnMouseReleased(e->{
                colorAdjust.setContrast(0);
                imageView.setEffect(colorAdjust);
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