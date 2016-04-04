package models;

import java.util.Hashtable;

public class PlayersCatalog {

    private Hashtable listOfPlayers = new Hashtable();

    public Hashtable getListOfPlayers() {
        return listOfPlayers;
    }

    public void addPlayer(Player player) {
        if (listOfPlayers.containsKey(player.getName())) {
            throw new IllegalArgumentException("User name must be unique.");
        }

        listOfPlayers.put(player.getName(), player.getScore());
    }
}
