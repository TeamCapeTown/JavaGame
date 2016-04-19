package io;

import engine.controllers.GameChooseController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionCatalogIO {

    public List<String[]> readQuiz()  {
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
}
