package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {

    private String Name;
    private String Password;
    private int Score;

    public Player(String name, String password) {
        this.setName(name);
        this.setPassword(password);
        this.setScore(0);
    }

    private boolean hasSpecialCharacter(String str) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {

        if (Password.isEmpty()) {
            throw new IllegalArgumentException("Password must be more than 0 symbols");
        }

        this.Name = name;
    }

    public String getPassword() {
        return Password;
    }

    private void setPassword(String password) throws IllegalArgumentException {

        if (password.isEmpty()) {
            throw new IllegalArgumentException("Password must be more than 0 symbols");
        }

        if (hasSpecialCharacter(password)) {
            throw new IllegalArgumentException("Password must be contain special character");
        }

        this.Password = password;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
