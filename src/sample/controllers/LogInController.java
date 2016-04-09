package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.Logger;
import models.Player;
import models.PlayersCatalog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static sample.controllers.ScreenController.loadSceneToSecondaryStage;

public class LogInController implements Initializable {
    @FXML
    public Button logInButton;
    @FXML
    public Button signUpButton;
    @FXML
    private TextField userNameField;
    @FXML
    private TextField userPasswordField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void logIn(ActionEvent actionEvent) {
        try {
            /*Logger logger = new Logger();
            PlayersCatalog catalog = new PlayersCatalog();
            Player Player = logger.logIn(userNameField.getText(), userPasswordField.getText(), catalog);*/
            loadSceneToSecondaryStage("GameChoose");
        } catch (IOException e) {
            System.out.println("Exception from loadSceneToSecondary");
        }
    }

    public void signUp(ActionEvent actionEvent) {
        try {
            /*Logger logger = new Logger();
            PlayersCatalog catalog = new PlayersCatalog();
            Player Player = logger.signIn(userNameField.getText(), userPasswordField.getText(), catalog);*/
            Player player = new Player(userNameField.getText(),userPasswordField.getText());
            loadSceneToSecondaryStage("GameChoose");
        } catch (IOException e) {
            System.out.println("Exception from loadSceneToSecondary");
        }
    }
}
