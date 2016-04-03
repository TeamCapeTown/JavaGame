package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Engine.Player;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    private Player player;

    @FXML
    private Button logInButton;
    @FXML
    private TextField userNameField;
    @FXML
    private TextField userPasswordField;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }/*
    private void onAction(ActionEvent event){
        System.out.println("test");
    }*/

    /*@FXML
    void LogInHandler() {
       if (userNameField.getText().isEmpty()) {
           ScreenController.showWarningNotification("Please select a username");
       } else {
           player.setName(userNameField.getText());
           player.setPassword(userPasswordField.getText());
           player.setScores(0);
           ScreenController.showGame(player);
       }
    }*/
}
