package engine.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;
import models.Game;
import models.Question;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    private final Game game;
    private boolean isAnswerChoosen;

    @FXML
    public Button startButton;
    @FXML
    public Button answerAButton;
    @FXML
    public Button answerBButton;
    @FXML
    public Button answerCButton;
    @FXML
    public Button answerDButton;

    @FXML
    public Label question;

    public List<Button> answerButtons;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        isAnswerChoosen = false;
        answerButtons = new ArrayList<>();
        answerButtons.add(answerAButton);
        answerButtons.add(answerBButton);
        answerButtons.add(answerCButton);
        answerButtons.add(answerDButton);

    }

    public GameController() {
        game = new Game();
    }

    @FXML
    public void chooseAnswerHandler(ActionEvent event) {
        if (!game.isFinished() && !isAnswerChoosen) {
            Question question = game.getCurrentQuestion();

            boolean isRight = game.chooseAnswer(((Button) event.getSource()).getText());
            isAnswerChoosen = true;

            for (Button answerButton : answerButtons) {
                if (question.CheckCorrectAnswer(answerButton.getText()))
                    answerButton.setStyle("-fx-background-color:#7fff00");
            }
            if (!isRight)
                ((Button) event.getSource()).setStyle("-fx-background-color:#dc143c");

            Timeline timeline = new Timeline(new KeyFrame(
                    Duration.millis(2000),
                    e -> {
                        for (Button answerButton : answerButtons) {
                            answerButton.setStyle("");
                        }
                        isAnswerChoosen = false;
                        //Start

                        if (game.isFinished()) {
                            disableAnswerButtons(true);
                        }
                    }));
            timeline.play();
        }

    }

    private void disableAnswerButtons(boolean value) {
        for (Button answerButton : answerButtons) {
            answerButton.setDisable(value);
        }
    }

    public void Start(ActionEvent actionEvent) throws InterruptedException {
        startButton.setVisible(false);
        question.setText("VUPROSSSSSS"/*game.getCurrentQuestion().getQUESTION()*/);

        Collections.shuffle(answerButtons);
        for (int i = 0; i < answerButtons.size() /*game.getCurrentQuestion().getANSWERS().size()*/; i++) {
            answerButtons.get(i).setText("Proba"/*game.getCurrentQuestion().getANSWERS().get(i)*/);
        }
    }

    public void isPressed(ActionEvent actionEvent) {
        question.setText("NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS ");
        question.setTextAlignment(TextAlignment.CENTER);
        question.wrapTextProperty().setValue(true);
    }
}