package models;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private final String QUESTION;
    private final List<String> ANSWERS;
    private boolean CheckCorrectAnswer;
    private String correctAnswerIndex;

    public Question(String question) { //Конструктор за въпросния обект, който съдържа само въпроса и празен списък с възможни отговори .
        QUESTION = question;
        ANSWERS = new ArrayList<>(4);// ще има четири възможни отговора. Тук ли да се посочи сорса с въпросите?
        CheckCorrectAnswer = false; // ще има проверка дали отговора е верен и ако да - тогава Boolean=true
    }

    public Question(String question, List<String> answers, boolean CheckCorrectAnswer) {
        this.QUESTION = question;
        this.ANSWERS = answers;
        this.CheckCorrectAnswer = CheckCorrectAnswer;
    }

    public String getQUESTION() { //връща въпроса като стринг, тук ли да се зададе от къде ще се вземат въпросите?

        return QUESTION;
    }


    public List<String> getAnswers() {
        return ANSWERS;
    }

    public boolean CheckCorrectAnswer(String answer) {
        if (answer.equals(ANSWERS.get(5))) {// 0-въпрос, 1,2,3,4 - отговори, 5 - правилен отговор
            CheckCorrectAnswer = true;
        }
        return true;
    }
}



