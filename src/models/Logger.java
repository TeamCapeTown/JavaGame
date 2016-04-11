package models;

public class Logger {

    public Player signIn(String name, String password, PlayersCatalog catalog) {
        Player player = new Player(name, password);
        catalog.addPlayer(player);
        return player;
    }

    public Player logIn(String name, String password, PlayersCatalog catalog) {
        Player player = new Player(name, password);

        if (!catalog.getListOfPlayers().containsKey(name)) {
            throw new IllegalArgumentException("U must create new player");
        }
        return player;
    }
}
