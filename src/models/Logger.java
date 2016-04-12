package models;

public class Logger {

    public Player signIn(String name, String password, PlayersCatalog catalog) {
        return catalog.addNewPlayer(name, password);
    }

    public Player logIn(String name, String password, PlayersCatalog catalog) {
        return catalog.getExistingPlayer(name, password);
    }
}
