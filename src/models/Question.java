package models;

import java.util.List;

public class Question {
    private String QUESTION;
    private List<String> ANSWERS;
    private boolean CheckCorrectAnswer;
    private int correctAnswerIndex;

    public String getQUESTION() {
        return this.QUESTION;
    }

    public List<String> getANSWERS() {
        return ANSWERS;
    }

    public String readingQuestionsAndAnswers() {
        StringBuilder read = new StringBuilder();
        read.append(QUESTION);
        read.append(" ");

        for (int i = 0; i < ANSWERS.size(); i++) {
            read.append(ANSWERS.get(i));
            if (i == correctAnswerIndex) { //ако се достигне индекса на верния отговор(отговорът винаги е последен), да се продължава нататък. Верния отговор е на последна позиция винаги
                break;
            }
        }
        return read.toString();
    }

    public boolean CheckCorrectAnswer(String answer) { //проверява дали избрания стринг отговаря на текста от последната позиция в листата с отговорите
        if (answer.equals(ANSWERS.get(correctAnswerIndex))) {
            return true;
        }
        return false;
    }
}



