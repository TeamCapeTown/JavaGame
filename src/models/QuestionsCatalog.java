package models;

import java.util.*;

public class QuestionsCatalog {

    private  Map<String, List<Question>> catalog;
    private String Category;

    public QuestionsCatalog() {
        catalog = new HashMap<>();//да се покаже от къде ще се взема въпросите
    }
    public String Category(){
        return this.Category;
    }
    public void addQuestion(String category, Question question) {
        if (catalog.containsKey(category)) {
            catalog.get(category).add(question);
        } else {
            List<Question> questions = new ArrayList<>();
            questions.add(question);
            catalog.put(category, questions);
        }
    }

    public Question getRandomQuestion(String category) { //произволно изтеглен въпрос от дадена категория
        Random random = new Random();
        return (Question)catalog.remove(random.nextInt(catalog.size()));
    }
}

