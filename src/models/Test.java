package models;

public class Test {

    public static void main(String[] args) {


        try {

            Logger logger = new Logger();
            RankList rankList = new RankList();

            Player atanas = logger.signIn("Atanas", "asdsddddddddd#_$");
            Player pesho = logger.logIn("Pesho", "asdsddddddddd#_$");
            Player haralampi = logger.signIn("Haralampi", "asdsddddddddd#_$");

            rankList.addScorePoint(atanas);
            rankList.addScorePoint(atanas);
            rankList.addScorePoint(pesho);
            rankList.addScorePoint(pesho);
            rankList.addScorePoint(pesho);
            rankList.addScorePoint(pesho);
            rankList.addScorePoint(haralampi);
            rankList.addScorePoint(haralampi);
            rankList.addScorePoint(haralampi);
            rankList.displayList();

            System.out.println(rankList.displayList());

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
