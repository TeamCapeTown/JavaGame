package engine.controllers;

import io.QuestionCatalogIO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import models.Question;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class BonusLevelController implements Initializable{

    @FXML
    public TextField questionField;
    @FXML
    public TextField answerField1;
    @FXML
    public TextField answerField2;
    @FXML
    public TextField answerField3;
    @FXML
    public TextField answerField4;
    @FXML
    public TextField correctAnswerField;
    @FXML
    public Button setNewQuestion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void addNewQuestion(ActionEvent actionEvent) {
        boolean isNotEmpty = !questionField.getText().isEmpty() && !answerField1.getText().isEmpty()
                && !answerField2.getText().isEmpty() && !answerField3.getText().isEmpty()
                && !answerField4.getText().isEmpty() && !correctAnswerField.getText().isEmpty();

        if (isNotEmpty){
            Question newQuestion = new Question(questionField.getText(),answerField1.getText(),answerField2.getText(),
                    answerField3.getText(),answerField4.getText(),correctAnswerField.getText());
            QuestionCatalogIO.writeQuiz(newQuestion);
        }
    }
}
