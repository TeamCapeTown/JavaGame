package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {
    public String Name;
    public String Password;
    public Integer Score;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) throws IllegalArgumentException {

        if (password.length() <= 8) {
            throw new IllegalArgumentException("Password must be more than 8 symbols");
        }

        if (hasSpecialCharacter(password)) {
            throw new IllegalArgumentException("Password must be contain special character");
        }

        this.Password = password;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        this.Score = score;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {

        if (name.length() < 3) {
            throw new IllegalArgumentException("Name must be more than 3 sumbols !");
        }

        this.Name = name;
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
        setName(name);
        setName(password);
        this.Score = 0;
    }
}
