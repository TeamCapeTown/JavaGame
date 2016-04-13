package models;

public class Logger {

    private PlayersCatalog playersCatalog;

    public Logger() {
        this.playersCatalog = new PlayersCatalog();
    }

    public Player signIn(String name, String password) {
        return this.getPlayersCatalog().addNewPlayer(name, password);
    }

    public Player logIn(String name, String password) {
        return this.getPlayersCatalog().getExistingPlayer(name, password);
    }

    public PlayersCatalog getPlayersCatalog() {
        return playersCatalog;
    }
}
