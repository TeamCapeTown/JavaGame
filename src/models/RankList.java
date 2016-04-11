package models;

import java.util.SortedMap;
import java.util.TreeMap;

public class RankList { //TODO get Player when logIn

    public RankList() {
    }

    private SortedMap<Integer, String> listOfPlayers = new TreeMap<>();

    SortedMap<Integer, String> displayList() {
        // TODO: 12.0.2016 г. Show only unique players
        return listOfPlayers;
    }

    public void addPlayer(Player player) {

        listOfPlayers.put(0, player.getName());
    }

    public void addScore(Player player, Integer score) {
        listOfPlayers.put(score, player.getName());
    }

}