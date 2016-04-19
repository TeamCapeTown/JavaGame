package engine.controllers;

import io.QuestionCatalogIO;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;
import models.Question;
import models.QuestionsCatalog;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import static engine.controllers.ScreenController.loadSceneToSecondaryStage;

public class GameController implements Initializable {
    private boolean isAnswerChoosen;
    private Question que;
    private QuestionsCatalog catalog;
    private boolean isNextQuestion = true;

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

    @FXML
    public void chooseAnswerHandler(ActionEvent event) {
        if (isNextQuestion && !isAnswerChoosen) {
            String buttonStl = answerAButton.getStyle();
            String buttonAnswerText = ((Button) event.getSource()).getText();
            boolean isRight = que.checkCorrectAnswer(buttonAnswerText);
            isAnswerChoosen = true;

            for (Button answerButton : answerButtons) {
                String answers = answerButton.getText();
                if (que.checkCorrectAnswer(answers)) {
                    answerButton.setStyle("-fx-background-color:#7fff00");
                }
            }
            if (!isRight) {
                ((Button) event.getSource()).setStyle("-fx-background-color:#dc143c");
            }

            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(2000), e -> {
                for (Button answerButton : answerButtons) {
                    answerButton.setStyle(buttonStl);
                }
                isAnswerChoosen = false;
                if (!isNextQuestion) {
                    disableAnswerButtons(true);
                }
                try {
                    catalog.nextQuestion();
                    que.nextQuestion(catalog);
                    setNewQuestion(que);
                } catch (Exception ex) {
                    isNextQuestion = false;
                    try {
                        loadSceneToSecondaryStage("GameChoose");
                        ScreenController.thirdStage.close();
                    } catch (IOException e1) {
                    }
                }
            }));
            timeline.play();
        }

    }

    private void disableAnswerButtons(boolean value) {
        for (Button answerButton : answerButtons) {
            answerButton.setDisable(value);
            answerButton.setVisible(value);
        }
    }

    public void startGame(ActionEvent actionEvent) throws InterruptedException, IOException {
        startButton.setVisible(false);
        QuestionCatalogIO IO = new QuestionCatalogIO();
        catalog = new QuestionsCatalog(IO);
        que = new Question(catalog);
        catalog.nextQuestion();
        setNewQuestion(que);
    }

    private void setNewQuestion(Question que) {
        question.setText(que.getQUESTION());
        question.setWrapText(true);
        Collections.shuffle(answerButtons);
        answerButtons.get(0).setText(que.getANSWERS().get(0));
        answerButtons.get(0).setWrapText(true);
        answerButtons.get(1).setText(que.getANSWERS().get(1));
        answerButtons.get(1).setWrapText(true);
        answerButtons.get(2).setText(que.getANSWERS().get(2));
        answerButtons.get(2).setWrapText(true);
        answerButtons.get(3).setText(que.getANSWERS().get(3));
        answerButtons.get(3).setWrapText(true);
    }
}
