package ch03;

/**
 * 疑似HARDゲージ残量からクリア可否を判断するプログラム。
 * クリア判定を真偽で、ゲージ残量を変数で表す。
 */
public class GaugeClearJudge {
    public static void main(String[] args) {
        String songName = "冥";
        double pseudoHardGauge = -12.5;
        boolean clear = false;
        if (pseudoHardGauge > 0.0) {
            clear = true;
        }
        System.out.println("曲名: " + songName);
        System.out.println("pseudoHardGauge: " + pseudoHardGauge + "%");
        if (clear) {
            System.out.println("result: HARD CLEAR");
        } else {
            System.out.println("result: HARD FAILED");
        }
    }
}
