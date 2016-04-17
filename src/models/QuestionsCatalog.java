package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class QuestionsCatalog {

    private  Map<String, List<Question>> catalog;
    private String Category;

    public QuestionsCatalog() {
        catalog = new HashMap<>();//да се покаже от къде ще се взема въпросите
    }
    public String Category(){
        return this.Category;
    }

    public Question getRandomQuestion(String category) { //произволно изтеглен въпрос от дадена категория
        Random random = new Random();
        return (Question)catalog.remove(random.nextInt(catalog.size()));
    }
}

