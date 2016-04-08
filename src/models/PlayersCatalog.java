package models;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class PlayersCatalog {

    public PlayersCatalog() {
    }

    private SortedMap<Integer, String> listOfPlayers = new TreeMap<>((Collections.reverseOrder()));

    SortedMap<Integer, String> getListOfPlayers() {

        return listOfPlayers;
    }

    public void signIn(Player player) {

        if (getListOfPlayers().containsValue(player.getName())) {
            throw new IllegalArgumentException("User name must be unique.");
        }

        listOfPlayers.put(0, player.getName());
    }

    public Player logIn(String name) {

        if (getListOfPlayers().containsValue(name)) {
            throw new IllegalArgumentException("User is not registered.");
        }

        Player currentPlayer = listOfPlayers.values(name);
    }

    public void setPlayerScore(Player player, Integer score) {
        listOfPlayers.put(score, player.getName());
    }

}