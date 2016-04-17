package engine;

import engine.controllers.ScreenController;
import io.QuestionCatalogIO;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static final String TITLE = "Java Quiz";
    public static final int NUM_ROUNDS = 4;
    public static int RIGHT_ANSWER_SCORE = 10;
    public static int WRONG_ANSWER_SCORE = -10;
    private static QuestionCatalogIO questionIO = new QuestionCatalogIO();
    public static int NUM_QUESTIONS_PER_ROUND = questionIO.getQuestions().size();

    @Override
    public void start(Stage primaryStage) throws Exception {
        ScreenController.setPrimaryStage(primaryStage);
        ScreenController.showLogin();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
