package models;

import io.RankListIO;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class RankList {

    private TreeMap<String, Integer> listOfPlayers = new TreeMap<>();

    public RankList() {
        this.listOfPlayers = RankListIO.LoadRankList();

    }

    public void writeRankList() {
        RankListIO.WriteRankList(this.listOfPlayers);
    }

    SortedMap<String, Integer> displayList() {
        Comparator<String> comparator = new ValueComparator(this.listOfPlayers);
        TreeMap<String, Integer> result = new TreeMap<>(comparator);
        result.putAll(this.listOfPlayers);
        return result;
    }

    public void addScorePoint(Player player) {
        if (!listOfPlayers.containsKey(player.getName())) {
            listOfPlayers.put(player.getName(), 0);
        }

        Integer score = listOfPlayers.get(player.getName());
        score++;
        listOfPlayers.put(player.getName(), score);
    }
}

