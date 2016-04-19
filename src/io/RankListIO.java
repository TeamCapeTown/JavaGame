package io;

import java.io.*;
import java.util.TreeMap;

public class RankListIO {

    public static TreeMap<String, Integer> LoadRankList() {
        TreeMap<String, Integer> list = new TreeMap<>();
        try (ObjectInputStream objReader = new ObjectInputStream(new FileInputStream("res/Players/RankList.list"))){
            list = (TreeMap<String, Integer>) objReader.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void WriteRankList(TreeMap<String, Integer> listOfPlayers) {
        TreeMap<String, Integer> LOP = listOfPlayers;
        try (ObjectOutputStream objWriter = new ObjectOutputStream(new FileOutputStream("res/Players/RankList.list"))) {
            objWriter.writeObject(LOP);
            objWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



