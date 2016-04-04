package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {
    private String name;
    private String password;
    private Integer score;

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) throws IllegalArgumentException {

        if (password.isEmpty()) {
            throw new IllegalArgumentException("password must be more than 0 symbols");
        }

        if (hasSpecialCharacter(password)) {
            throw new IllegalArgumentException("password must be contain special character");
        }

        this.password = password;
    }

    Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {

        if (password.isEmpty()) {
            throw new IllegalArgumentException("password must be more than 0 symbols");
        }

        this.name = name;
    }

    private boolean hasSpecialCharacter(String str) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public Player(String name, String password) {
        this.setName(name);
        this.setPassword(password);
        this.setScore(0);
    }
}
