package Control;
import Vue.Vue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import Model.Dimension;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import  javafx.scene.Node;

public class Controller2 {
    @FXML private Rectangle rect;
    @FXML private Line lineLong;
    @FXML private Line lineLarg;
    @FXML private Text textLarg;
    @FXML private Text textLong;


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
}
