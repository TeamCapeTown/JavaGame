package models;

public class Test {

    public static void main(String[] args) {


        try {

            Logger logger = new Logger();
            PlayersCatalog catalog = new PlayersCatalog();
            Player pesho1 = logger.signIn("Pesho", "asdsddddddddd#_$", catalog);
            Player pesho2 = logger.logIn("Pesho", "asdsddddddddd#_$", catalog);

            catalog.setPlayerScore(pesho1, 1);
            catalog.setPlayerScore(pesho1, 10000);

//            Player asd = new Player();
//            pesho.signUp("Peshoа", "asdsddddddddd#$");
//            playerCatalog.setPlayerScore(asd, 1);
//            playerCatalog.setPlayerScore(asd, 500);
//            pesho.logIn(asd);

            System.out.println(catalog.getListOfPlayers());

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
