import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TestApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.initStyle(StageStyle.UNDECORATED);
        Button button = new Button("Minimize");
        button.setStyle("-fx-background-color: red;");
        button.setOnAction(evt -> stage.setIconified(true));
        Scene scene = new Scene(button); stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}

