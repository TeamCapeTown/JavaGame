package models;

import java.util.SortedMap;
import java.util.TreeMap;

public class PlayersCatalog { //TODO get Player when logIn

    public PlayersCatalog() {
    }

    private SortedMap<Player, Integer> listOfPlayers = new TreeMap<>();

    SortedMap<Player, Integer> getListOfPlayers() {

        return listOfPlayers;
    }

    public void addPlayer(Player player) {
        if (listOfPlayers.containsKey(player.getName())) {
            throw new IllegalArgumentException("Player name must be unique.");
        }
        listOfPlayers.put(player, 0);
    }

    public void setPlayerScore(Player player, Integer score) {
        listOfPlayers.put(player, score);
    }

}