package Vue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Vue extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Cuisine2D");
        Pane myPane =
                (Pane)FXMLLoader.load(getClass().getResource("../Control/piia.fxml"));
        Scene myScene = new Scene(myPane, 1250, 800);
        primaryStage.setScene(myScene);    //utiliser ça pour changer de pages
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
