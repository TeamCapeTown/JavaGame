package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class QuestionCatalogIO {

    public void addQuestion() {

        String question ="";
        String answerOne ="";
        String answerTwo ="";
        String answerThree ="";
        String answerFour="";
        String correctAnswer ="";
    String newQuestion = (question + "|" + answerOne + "|" + answerTwo + "|" + answerThree+ "|" + answerFour + "|" + correctAnswer +"\r\n");
    try {
        BufferedWriter questionWriter = new BufferedWriter(new FileWriter("QuestionsCatalog.txt", true));
        questionWriter.write(newQuestion + "\n");
    } catch (IOException ioe){
        System.out.print("The horror!");
    }

}

    public String[] QuestionInfo() {
        String[] thisQuestion = new String[6];

        try {
            BufferedReader questionInfoReader = new BufferedReader(new FileReader("QuestionsCatalog.txt"));
            thisQuestion = (questionInfoReader.readLine()).split("\\|");

        } catch (IOException ioe) {
            System.out.println("Register some questions first dumbass. ಠ_ಠ");
        }

        return thisQuestion;
    }

    public List<String> getQuestions() {
        List<String> questions = new ArrayList<String>();
        try {
            double count = Files.lines(Paths.get("QuestionsCatalog.txt")).count();
            for (int i = 0; i < count; i++) {
                questions.add(QuestionInfo()[0]);
            }

        } catch (IOException ioe) {
            System.out.println("Register some questions first dumbass. ಠ_ಠ");

        }
        return questions;
    }

    public List<String> getCorrectAnswers() {
        List<String> correctAnswers = new ArrayList<String>();
        try {
            double count = Files.lines(Paths.get("QuestionsCatalog.txt")).count();
            for (int i = 0; i < count; i++) {
                correctAnswers.add(QuestionInfo()[5]);
            }

        } catch (IOException ioe) {
            System.out.println("Register some questions first dumbass. ಠ_ಠ");

        }
        return correctAnswers;
    }

}
