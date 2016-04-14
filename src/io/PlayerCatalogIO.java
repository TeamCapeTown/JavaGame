package io;


import models.Player;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class PlayerCatalogIO {

    public void addPlayer() {

        Player player = new Player("", "");

        String name = player.getName();
        String password = player.getPassword();
        String score = "0";
        String newPlayer = (name + "|" + password + "|" + score);

        try {
            BufferedWriter playerWriter = new BufferedWriter(new FileWriter("PlayersCatalog.txt", true));
            playerWriter.write(newPlayer + "\r\n");
            playerWriter.close();

        } catch (IOException ioe) {
            System.out.print("Oh noez!");
        }
    }

    public String[] PlayerInfo() {
        String[] thisPlayer = new String[3];

        try {
            BufferedReader playerInfoReader = new BufferedReader(new FileReader("PlayersCatalog.txt"));
            thisPlayer = (playerInfoReader.readLine()).split("\\|");

        } catch (IOException ioe) {
            System.out.println("Register first dumbass. ಠ_ಠ");
        }

        return thisPlayer;
    }

    public List<String> getNames() {
        List<String> playerNames = new ArrayList<String>();
        try {
            double count = Files.lines(Paths.get("PlayersCatalog.txt")).count();
            for (int i = 0; i < count; i++) {
                playerNames.add(PlayerInfo()[0]);
            }

        } catch (IOException ioe) {
            System.out.println("Register first dumbass. ಠ_ಠ");
        }
        return playerNames;
    }

    public List<String> getPasswords() {
        List<String> playerPasswords = new ArrayList<String>();
        try {
            double count = Files.lines(Paths.get("PlayersCatalog.txt")).count();
            for (int i = 0; i < count; i++) {
                playerPasswords.add(PlayerInfo()[1]);
            }

        } catch (IOException ioe) {
            System.out.println("Register first dumbass. ಠ_ಠ");

        }
        return playerPasswords;
    }

    public List<String> getScores() {
        List<String> playerScores = new ArrayList<String>();
        try {
            double count = Files.lines(Paths.get("PlayersCatalog.txt")).count();
            for (int i = 0; i < count; i++) {
                playerScores.add(PlayerInfo()[2]);
            }

        } catch (IOException ioe) {
            System.out.println("Register first dumbass. ಠ_ಠ");

        }
        return playerScores;
    }

    public static TreeMap<String, String> LoadPlayers() {
        return null;
    }
}



