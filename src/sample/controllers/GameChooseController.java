package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.controllers.ScreenController.loadSceneToThirdStage;

public class GameChooseController implements Initializable {

    private String quizChoose = "";
    private String gameType = "";

    @FXML
    public Button javaBasicQuiz;
    @FXML
    public Button javaArrayQuiz;
    @FXML
    public Button javaCollectionQuiz;
    @FXML
    public Button javaOOPQuiz;
    @FXML
    public Button backButton;
    @FXML
    public Label backLabel;
    @FXML
    public VBox selectQuiz;
    @FXML
    public VBox gameModeButtons;
    @FXML
    public Button challengeGame;
    @FXML
    public Button singleGame;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void basicChoose(ActionEvent actionEvent) throws IOException {
        //loadSceneToThirdStage("GameMode");
        quizChoose = "basic";
        selectQuiz.setVisible(false);
        gameModeButtons.setVisible(true);
        backLabel.setVisible(true);
    }

    public void arrayChoose(ActionEvent actionEvent) throws IOException {
        //loadSceneToThirdStage("GameMode");
        quizChoose = "array";
        selectQuiz.setVisible(false);
        gameModeButtons.setVisible(true);
        backLabel.setVisible(true);
    }

    public void collectionChoose(ActionEvent actionEvent) throws IOException {
        //loadSceneToThirdStage("GameMode");
        quizChoose = "collection";
        selectQuiz.setVisible(false);
        gameModeButtons.setVisible(true);
        backLabel.setVisible(true);
    }

    public void oopChoose(ActionEvent actionEvent) throws IOException {
        //loadSceneToThirdStage("GameMode");
        quizChoose = "oop";
        selectQuiz.setVisible(false);
        gameModeButtons.setVisible(true);
        backLabel.setVisible(true);
    }

    public void pressedBack(ActionEvent actionEvent) {
        gameModeButtons.setVisible(false);
        selectQuiz.setVisible(true);
        backLabel.setVisible(false);
    }

    public void selectSingleGame(ActionEvent actionEvent) throws IOException {
        gameType = "single";
        loadSceneToThirdStage("QuizSolving");
    }

    public void selectChallengeGame(ActionEvent actionEvent) {
        gameType = "challenge";
    }
}
