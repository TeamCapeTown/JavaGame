package sample.Engine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {
    private String name;
    private String password;
    private Integer scores;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws IllegalArgumentException {

        if (password.length() <= 8) {
            throw new IllegalArgumentException("Password must be more than 8 symbols");
        }

        if (hasSpecialCharacter(password)) {
            throw new IllegalArgumentException("Password must be contain special character");
        }

        this.password = password;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean hasSpecialCharacter(String str) {

        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }

    public Player(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
