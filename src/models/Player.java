package models;

public class Player {

    private String Name;
    private String Password;

    public Player(String name, String password) {
        this.setName(name);
        this.setPassword(password);
    }

//    private boolean hasSpecialCharacter(String str) {
//        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
//        Matcher matcher = pattern.matcher(str);
//        return matcher.find();
//    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {

        if (name.isEmpty()) {
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

//        if (hasSpecialCharacter(password)) {
//            throw new IllegalArgumentException("Password must be contain special character");
//        }

        this.Password = password;
    }

}
