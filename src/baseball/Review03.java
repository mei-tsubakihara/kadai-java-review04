package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team01 = new BaseBallTeam();
        team01.setName("東京ヤクルトスワローズ");
        team01.setWin(80);
        team01.setLose(59);
        team01.setDraw(4);
        team01.report();

        BaseBallTeam team02 = new BaseBallTeam();
        team02.setName("横浜DeNAベイスターズ");
        team02.setWin(73);
        team02.setLose(68);
        team02.setDraw(2);
        team02.report();

        BaseBallTeam team03 = new BaseBallTeam();
        team03.setName("阪神タイガース");
        team03.setWin(68);
        team03.setLose(71);
        team03.setDraw(4);
        team03.report();

        BaseBallTeam team04 = new BaseBallTeam();
        team04.setName("読売ジャイアンツ");
        team04.setWin(68);
        team04.setLose(72);
        team04.setDraw(3);
        team04.report();

        BaseBallTeam team05 = new BaseBallTeam();
        team05.setName("広島東洋カープ");
        team05.setWin(66);
        team05.setLose(74);
        team05.setDraw(3);
        team05.report();
        
        BaseBallTeam team06 = new BaseBallTeam();
        team06.setName("中日ドラゴンズ");
        team06.setWin(66);
        team06.setLose(75);
        team06.setDraw(2);
        team06.report();
    }

}
