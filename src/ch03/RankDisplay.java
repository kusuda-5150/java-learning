package ch03;

/**
 * スコアレートから達成したランクを判定し表示する。
 */
public class RankDisplay {
    public static void main(String[] args) {
        String songName = "Blue Mirage";
        double scoreRate = 89.12;
        System.out.println("曲名: " + songName);
        System.out.println("score rate: " + scoreRate + "%");
        String rank = null;
        if (scoreRate >= 94.44) {
            rank = "MAX-";
        } else if (scoreRate >= 88.88) {
            rank = "AAA";
        } else if (scoreRate >= 77.77) {
            rank = "AA";
        } else if (scoreRate >= 66.66) {
            rank = "A";
        } else {
            rank = "B以下";
        }
        System.out.println("rank: " + rank);
    }
}
