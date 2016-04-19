package engine;

import engine.controllers.ScreenController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static final String TITLE = "Java Quiz";
    public static int RIGHT_ANSWER_SCORE = 10;
    public static int WRONG_ANSWER_SCORE = -10;

    @Override
    public void start(Stage primaryStage) throws Exception {
        ScreenController.setPrimaryStage(primaryStage);
        ScreenController.showLogin();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
