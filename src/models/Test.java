package models;

public class Test {

    public static void main(String[] args) {


        try {

            Logger logger = new Logger();
            PlayersCatalog catalog = new PlayersCatalog();
            Player ivan = logger.signIn("Ivan", "asdsddddddddd#_$", catalog);
            Player pesho = logger.logIn("Pesho", "asdsddddddddd#_$", catalog);
            Player haralampi = logger.signIn("Haralampi", "asdsddddddddd#_$", catalog);

            RankList rankList = new RankList();

            rankList.addPlayer(ivan);
            rankList.addScore(ivan, 10000);
            rankList.displayList();

            rankList.addPlayer(pesho);
            rankList.addScore(pesho, 90);

            rankList.addPlayer(haralampi);
            rankList.addScore(haralampi, 89);

            System.out.println(rankList.displayList());

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
