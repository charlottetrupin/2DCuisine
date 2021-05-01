package Control;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javax.swing.*;
import java.awt.*;
import Model.Dimension;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;


public class Controller {

    @FXML private TextField larg;
    @FXML private TextField lon;
    @FXML private Rectangle rect;
    @FXML private Line lineLong;
    @FXML private Line lineLarg;
    @FXML private Text textLarg;
    @FXML private Text textLong;
    @FXML private Button valide;
    @FXML private Tab equipement;


    @FXML
    protected void valide(MouseEvent e){
        Dimension dim = new Dimension(Integer.parseInt(lon.getText()), Integer.parseInt(larg.getText()));
        dim.echelle(this.rect,this.lineLong,this.lineLarg,this.textLong,this.textLarg);
    }

    @FXML
    protected void equipementSelect(){

        System.out.println("coucou");
    }

}
