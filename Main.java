import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        var view_main = getClass().getResource("View.fxml");

        var loader = new FXMLLoader();
        loader.setLocation(view_main);

        var scene = new Scene(loader.load());

        Image icon = new Image(getClass().getResourceAsStream("asset/Logo-ITC-PNG.png"));
        stage.getIcons().add(icon);

        stage.setScene(scene);
        stage.show();

    }

}