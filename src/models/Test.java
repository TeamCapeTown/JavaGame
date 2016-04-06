package models;

public class Test {

    public static void main(String[] args) {
        Player pesho = new Player("Pesho", "asdsddddddddd#$");
        Player gosho = new Player("Gosho", "asssssdddddd#$");
        Player ivan = new Player("Ivan", "asssssssssdddddd#$");
        Player tosho = new Player("Tosho", "asssssssssdddddd#$");
        Player minka = new Player("Minka", "asssssssssdddddd#$");

        try {

            PlayersCatalog playerCatalog = new PlayersCatalog();
            playerCatalog.addPlayer(pesho);
            playerCatalog.setPlayerScore(pesho, 1);
            playerCatalog.setPlayerScore(pesho, 10000);
            playerCatalog.addPlayer(gosho);

//                playerCatalog.addPlayer(gosho);

            playerCatalog.setPlayerScore(gosho, 5);
            playerCatalog.setPlayerScore(gosho, 455);

            playerCatalog.addPlayer(ivan);
            playerCatalog.setPlayerScore(ivan, 20);

            playerCatalog.addPlayer(tosho);
            playerCatalog.setPlayerScore(tosho, 20);

            playerCatalog.addPlayer(minka);
            playerCatalog.setPlayerScore(minka, 3);

            System.out.println(playerCatalog.getListOfPlayers());

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
