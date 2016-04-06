package models;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class PlayersCatalog {

    public PlayersCatalog() {
    }

    private HashMap<String, Integer> listOfPlayers = new HashMap<>();

    HashMap<String, Integer> getListOfPlayers() {

        HashMap<String, Integer> sortedMap = listOfPlayers.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())/*.limit(10)*/
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

//        HashMap<String, Integer> reversedHashMap = new HashMap<>();

        return sortedMap;
    }


    public void addPlayer(Player player) {

        if (getListOfPlayers().containsKey(player.getName())) {
            throw new IllegalArgumentException("User name must be unique.");
        }

        listOfPlayers.put(player.getName(), 0);
    }

    public void setPlayerScore(Player player, Integer score) {
        listOfPlayers.put(player.getName(), score);
    }

}
