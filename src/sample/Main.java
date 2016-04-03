package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.controllers.ScreenController;

public class Main extends Application {
    public static final String TITLE = "Java Quiz";
    public static final String PATH_HIGHSCORE = "res/sample/IO/highScore.txt";
    public static final String PATH_QUESTIONS = "res/sample/IO/questions.txt";

    public static final int NUM_ROUNDS = 5;

    public static final int NUM_QUESTIONS_PER_ROUND = 3;

    public static final int NUM_QUESTION_POSSIBILITIES = 4;

    public static final int RIGHT_ANSWER_SCORE = 100;

    public static final int WRONG_ANSWER_SCORE = -50;

    public static final int MAX_HIGHSCORE_SLOTS = 10;


    @Override
    public void start(Stage primaryStage) throws Exception{
        ScreenController.setPrimaryStage(primaryStage);
        ScreenController.showLogin();
    }
}
