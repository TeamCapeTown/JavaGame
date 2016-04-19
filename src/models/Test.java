package models;

public class Test {

    public static void main(String[] args) {


        try {

            UserLogger logger = new UserLogger();

            Player atanas = logger.signUp("Atanas", "asdsddddddddd#_$");
            Player pesho = logger.logIn("Pesho", "asdsddddddddd#_$");
            Player haralampi = logger.signUp("Haralampi", "asdsddddddddd#_$");

            RankList rankList = new RankList();
            rankList.addScorePoint(atanas);
            rankList.addScorePoint(atanas);
            rankList.addScorePoint(pesho);
            rankList.addScorePoint(pesho);
            rankList.addScorePoint(pesho);
            rankList.addScorePoint(pesho);
            rankList.addScorePoint(haralampi);
            rankList.addScorePoint(haralampi);
            rankList.addScorePoint(haralampi);
            rankList.writeRankList();
            rankList.displayList();

            System.out.println(rankList.displayList());

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
