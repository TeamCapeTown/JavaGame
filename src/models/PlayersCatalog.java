package models;

import io.PlayerCatalogIO;

import java.util.Objects;
import java.util.TreeMap;

public class PlayersCatalog {

    private TreeMap<String, String> playersCatalog = new TreeMap<>();

    public PlayersCatalog() {
        this.playersCatalog = PlayerCatalogIO.LoadPlayers();
    }

    public Player addNewPlayer(String name, String password) {
        Player player;
        if (playersCatalog.containsKey(name)) {
            throw new IllegalArgumentException("Player name must be unique");
        }else {
            player  = new Player(name, password);
            PlayerCatalogIO.addPlayer(player);
        }
        return player;
    }

    public Player getExistingPlayer(String name, String password) {

        if (!playersCatalog.containsKey(name)) {
            throw new IllegalArgumentException("Player do not exist");
        }

        if (!Objects.equals(playersCatalog.get(name), password)) {
            throw new IllegalArgumentException("Password is not correct");
        }

        Player player = new Player(name, password);
        return player;
    }
    public int getPlayerScores(String playerName){
        TreeMap<String,Integer> playerScore = PlayerCatalogIO.loadPlayerScores();
        int playerScores = playerScore.get(playerName);
        return playerScores;
    }
}


