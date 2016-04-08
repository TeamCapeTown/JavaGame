package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {

    private String Name;
    private String Password;

    public Player(String name, String password) {
        this.setName(name);
        this.setPassword(password);
    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Password must be more than 0 symbols");
        }

        this.Name = name;
    }

    private String getPassword() {
        return Password;
    }

    private void setPassword(String password) throws IllegalArgumentException {

        if (password.isEmpty()) {
            throw new IllegalArgumentException("Password must be more than 0 symbols");
        }

        if (!hasSpecialCharacter(password)) {
            throw new IllegalArgumentException("Password must be contain special character");
        }

        this.Password = password;
    }

    private boolean hasSpecialCharacter(String str) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

}
