package models;

import java.util.List;

public class Question {
    private String QUESTION;
    private List<String> ANSWERS;
    private String correctAnswer;

    public List<String> getANSWERS() {
        return ANSWERS;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public Question(QuestionsCatalog catalog){
        QUESTION = catalog.getQuestion();
        ANSWERS =  catalog.getAnswers();
        correctAnswer = catalog.getCorrectAnswer();
    }

    public void nextQuestion(QuestionsCatalog catalog){
        QUESTION = catalog.getQuestion();
        ANSWERS =  catalog.getAnswers();
        correctAnswer = catalog.getCorrectAnswer();
    }

    public boolean checkCorrectAnswer(String answer) { //проверява дали избрания стринг отговаря на текста от последната позиция в листата с отговорите
        if (answer.equals(getCorrectAnswer())) {
            return true;
        }
        return false;
    }
}



