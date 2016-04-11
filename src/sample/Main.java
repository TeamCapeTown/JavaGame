package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.controllers.ScreenController;

public class Main extends Application {
    public static final String TITLE = "Java Quiz";

    @Override
    public void start(Stage primaryStage) throws Exception {
        ScreenController.setPrimaryStage(primaryStage);
        ScreenController.showLogin();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
