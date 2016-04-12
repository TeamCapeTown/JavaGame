package models;

import java.util.SortedMap;
import java.util.TreeMap;

public class PlayersCatalog {

    private SortedMap<String, String> playersCatalog = new TreeMap<>();

    public PlayersCatalog() {
    }

    public Player addNewPlayer(String name, String password) {

        //// TODO: 12.04.2016 г. Validation for existing Player
        if (playersCatalog.containsKey(name)) {
            throw new IllegalArgumentException("Player name must be unique");
        }

        Player player = new Player(name, password);
        return player;
    }

    public Player getExistingPlayer(String name, String password) {

        // TODO: 12.04.2016 г. validation for existing player
        Player player = new Player(name, password);
        return player;
    }
}