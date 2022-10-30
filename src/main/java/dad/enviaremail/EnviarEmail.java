package dad.enviaremail;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EnviarEmail extends Application {

    @Override
    public void start(Stage stage) {
        new Controller(stage);
    }

    public static void main(String[] args) {
        launch();
    }

}