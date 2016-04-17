package models;

import engine.Main;

import java.util.List;
import java.util.Random;

public class Game {
    private String currentCategory;
    private int roundNum;
    private int questionNum;
    private Question currentQuestion;
    private QuestionsCatalog questionCatalog;
    private List<String> categories;
    private Player player;
    private boolean finished;
    private Random rand;

    public Game() {
        questionNum = 0;
        roundNum = 0;
        finished = false;
    }

    public String getCurrentCategory() {
        return currentCategory;
    }

    public Question getCurrentQuestion() {
        return currentQuestion;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean chooseAnswer(String answer) {
        //int score = player.getScore();//TODO
        questionNum++;

        if (currentQuestion.CheckCorrectAnswer(answer)) {
            //player.setScore(score + Main.RIGHT_ANSWER_SCORE);
            updateStatus();
            return true;
        } else {
            //player.setScore(score + Main.WRONG_ANSWER_SCORE);
            updateStatus();
            return false;
        }

    }
    public void setQuestionCatalog(QuestionsCatalog questionCatalog) {
        this.questionCatalog = questionCatalog;
        rand = new Random();
        currentCategory = categories.remove(rand.nextInt(categories.size()));
        currentQuestion = questionCatalog.getRandomQuestion(currentCategory);
    }

    private void updateStatus() {
        questionNum++;
        questionCatalog = new QuestionsCatalog();

        if (questionNum % Main.NUM_QUESTIONS_PER_ROUND == 0) {
            roundNum++;
            if (roundNum >= Main.NUM_ROUNDS) {
                this.finished = true;
            } else {
                currentQuestion = questionCatalog.getRandomQuestion(currentCategory);
            }
        } else {
            currentQuestion = questionCatalog.getRandomQuestion(currentCategory);
        }
    }
    public boolean isFinished() {
        return finished;
    }
}

