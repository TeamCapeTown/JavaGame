package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import models.Player;
import sample.Main;

import java.io.IOException;

public class ScreenController {
    private static Stage primaryStage;
    private static Stage secondaryStage;
    private static Stage thirdStage;
    private static AnchorPane root;
    private static Pane gameChoose;
    private static Pane gameMode;

    public static void setPrimaryStage(Stage primaryStage) throws IOException {
        primaryStage.setTitle(Main.TITLE);
        root = FXMLLoader.load(Main.class.getResource("scenes/LogIn.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        ScreenController.primaryStage = primaryStage;
    }

    public static <T> T loadSceneToPrimaryStage(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("scenes/" + fxml + ".fxml"));

        try {
            root = FXMLLoader.load(Main.class.getResource("scenes/LogIn.fxml"));
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }

        primaryStage.show();
        return fxmlLoader.<T>getController();
    }

    public static <T> T loadSceneToSecondaryStage(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("scenes/" + fxml + ".fxml"));

        if (secondaryStage == null) {
            secondaryStage = new Stage();
        }
        try {
            gameChoose = FXMLLoader.load(Main.class.getResource("scenes/GameChoose.fxml"));
            secondaryStage.setScene(new Scene(gameChoose));
            secondaryStage.setTitle(Main.TITLE);
            secondaryStage.setResizable(false);
            primaryStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        secondaryStage.show();
        return fxmlLoader.<T>getController();
    }
    /*public static <T> T loadSceneToThirdStage(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("scenes/" + fxml + ".fxml"));

        if (thirdStage == null) {
            thirdStage = new Stage();
        }
        try {
            gameMode = FXMLLoader.load(Main.class.getResource("scenes/GameMode.fxml"));
            thirdStage.setScene(new Scene(gameMode));
            thirdStage.setTitle(Main.TITLE);
            thirdStage.setResizable(false);
            secondaryStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        thirdStage.show();
        return fxmlLoader.<T>getController();
    }*/


    public static void showLogin() {
        loadSceneToPrimaryStage("LoginScreen");
    }


    public static void showGame(Player player) {/*
        GameController gameController = loadSceneToPrimaryStage("Game");
        gameController.initPlayer(player);*/
    }

    public static void showHighscore(Player player) {
      /*  HighscoreController highscoreController = loadSceneToSecondaryStage("Highscore");
        highscoreController.initPlayer(player);
        highscoreController.initHighscore(secondaryStage.getScene().getRoot());*/
    }
}
