package sample.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

import java.net.URL;
import java.util.ResourceBundle;

public class QuestionsController implements Initializable{
    @FXML
    public Button startButton;

    @FXML
    public Label question;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void Start(ActionEvent actionEvent) throws InterruptedException {
        startButton.setVisible(false);
        question.setText("VUPROS");
        question.setTextAlignment(TextAlignment.CENTER);
        question.wrapTextProperty().setValue(true);
    }

    public void isPressed(ActionEvent actionEvent) {
        question.setText("NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS NOV VUPROS ");
        question.setTextAlignment(TextAlignment.CENTER);
        question.wrapTextProperty().setValue(true);
    }
}
