package sample.controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
        logInButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                //TODO Validation
                try {
                    loadSceneToSecondaryStage("GameChoose");
                } catch (IOException e) {
                    System.out.println("Exception from loadSceneToSecondary");
                }
            }
        });
        signUpButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {

                    String name = userNameField.getText();
                    String password = userPasswordField.getText();

                    Player player = new Player(name, password);

                    PlayersCatalog playerCatalog = new PlayersCatalog();
                    playerCatalog.addPlayer(player);

                } catch (IllegalArgumentException e) {
                    System.out.println(e);
                }
                try {
                    loadSceneToSecondaryStage("GameChoose");
                } catch (IOException e) {
                    System.out.println("Exception from loadSceneToSecondary");
                }
            }
        });
    }/*

    @FXML
    void logInHandler() throws IllegalArgumentException {
        Player player = new Player(userNameField.getText(), userPasswordField.getText());
        ScreenController.showGame(player);
    }*/
}
