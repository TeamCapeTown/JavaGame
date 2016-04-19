package io;


import models.Player;

import java.io.*;
import java.util.TreeMap;

public class PlayerCatalogIO {

    public static void addPlayer(Player player) {
        String name = player.getName();
        String password = player.getPassword();
        String score = "0";
        String newPlayer = (name + "|" + password + "|" + score);

        try {
            BufferedWriter playerWriter = new BufferedWriter(new FileWriter("res/Players/PlayersCatalog.txt", true));
            playerWriter.write(newPlayer + "\r\n");
            playerWriter.close();

        } catch (IOException ioe) {
            System.out.print("Oh noez!");
        }
    }

    public static TreeMap<String, String> PlayerLoads() {
        String[] playerCatalog;
        TreeMap<String, String> player = new TreeMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("res/Players/PlayersCatalog.txt"));

            while (!(playerCatalog = reader.readLine().split("\\|")).equals(null)) {
                player.put(playerCatalog[0],playerCatalog[1]);
            }
        } catch (Exception e) {
        }
        return player;
    }

    public static TreeMap<String, String> LoadPlayers() {
        TreeMap<String,String> player = PlayerLoads();
        return player;
    }
    public static TreeMap<String,Integer> loadPlayerScores(){
        String[] playerData;
        TreeMap<String, Integer> player = new TreeMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("res/Players/PlayersCatalog.txt"));

            while (!(playerData = reader.readLine().split("\\|")).equals(null)) {
                player.put(playerData[0],Integer.parseInt(playerData[2]));
            }
        } catch (Exception e) {
        }
        return player;
    }
    public static void savePlayer(Player player) {
        String name = player.getName();
        String password = player.getPassword();
        int score = player.getPlayerScore();
        String newPlayer = (name + "|" + password + "|" + score);

        try {
            BufferedWriter playerWriter = new BufferedWriter(new FileWriter("res/Players/PlayersCatalog.txt"));
            playerWriter.write(newPlayer + "\r\n");
            playerWriter.close();

        } catch (IOException ioe) {
        }
    }
}



