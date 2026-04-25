package ch01;

/**
 * beatorajaの1回分のプレイ結果を変数に入れて表示する練習。
 * 曲名、譜面、ノーツ数、BP、スコア率、ゲージ値を扱う。
 * 将来の統計ツールにおけるプレイ結果表示処理の基礎になる。
 */

public class PlayResultDisplay {
    public static void main(String[] args) {

        String songName = "Blue Mirage";
        String songDiff = "Another";
        int notesNum = 1800;
        int nowBp = 72;
        double scoreRate = 83.45;
        double pseudoGauge = 64.8;

        System.out.println("曲名：" + songName);
        System.out.println("難易度：" + songDiff);
        System.out.println("ノーツ数：" + notesNum);
        System.out.println("今回BP：" + nowBp);
        System.out.println("スコア率：" + scoreRate);
        System.out.println("疑似HARDゲージ：" + 64.8 + "%");
    }
}
