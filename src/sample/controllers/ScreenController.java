package sample.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.layout.AnchorPane;
import sample.Engine.Player;
import sample.Main;

public class ScreenController {
    private static Stage primaryStage;
    private static AnchorPane root;

    public static void setPrimaryStage(Stage primaryStage) throws IOException {
        primaryStage.setTitle(Main.TITLE);
        root = FXMLLoader.load(Main.class.getResource("scenes/LogIN.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        ScreenController.primaryStage = primaryStage;
    }


    private static <T> T loadSceneToPrimaryStage(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("scenes/" + fxml + ".fxml"));

        try {
            root = FXMLLoader.load(Main.class.getResource("scenes/LogIN.fxml"));
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }

        primaryStage.show();
        return fxmlLoader.<T>getController();
    }

   /* private static <T> T loadSceneToSecondaryStage(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("scenes/" + fxml + ".fxml"));

       *//* if (secondaryStage == null) {
            secondaryStage = new Stage();
        }
        try {
            secondaryStage.setScene(new Scene(fxmlLoader.load()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        secondaryStage.show();
        return fxmlLoader.<T>getController();*//*
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
