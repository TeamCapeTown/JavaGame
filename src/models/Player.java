package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {

    private String Name;
    private String Password;

    public Integer getPlayerScore() {
        return PlayerScore;
    }

    public void setPlayerScore(Integer playerScore) {
        PlayerScore = playerScore;
    }

    private int PlayerScore;

    public Player(String name, String password) {
        this.setName(name);
        this.setPassword(password);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name must be more than 0 symbols");
        }

        this.Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) throws IllegalArgumentException {

        if (password.isEmpty()) {
            throw new IllegalArgumentException("Password must be more than 0 symbols");
        }

        this.Password = password;
    }

    private boolean hasSpecialCharacter(String str) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

}
