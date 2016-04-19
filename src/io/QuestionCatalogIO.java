package io;

import engine.controllers.GameChooseController;
import models.Question;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionCatalogIO {

    public List<String[]> readQuiz() {
        List<String[]> quiz = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("res/Questions/" + GameChooseController.getQuizChoose() + ".txt"));
            String[] line;
            while (!(line = reader.readLine().split("\\|")).equals(null)) {
                quiz.add(line);
            }
        } catch (Exception e) {
        }
        return quiz;
    }

    public void writeQuiz(Question que) {
        String question = que.getQUESTION() + "|" + que.getANSWERS().get(0) + "|" + que.getANSWERS().get(1) + "|" +
                que.getANSWERS().get(2) + "|" + que.getANSWERS().get(3) + "|" + que.getCorrectAnswer();
        try (PrintWriter writer = new PrintWriter(new FileWriter("res/Questions/" + GameChooseController.getQuizChoose() + ".txt", true))) {
            writer.write(question);
            writer.flush();
        } catch (IOException exe) {
            exe.printStackTrace();
        }
    }
}
