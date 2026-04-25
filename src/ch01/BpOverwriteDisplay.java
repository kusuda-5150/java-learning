package ch01;

/**
 * 1つのBP変数に前回値を入れ、今回値で上書きする練習。
 * 変数の再代入により、プレイ前後の値の変化を表示する。
 * 将来の統計ツールにおける最新プレイ結果の更新処理につながる。
 */

public class BpOverwriteDisplay {
    public static void main(String[] args) {

        String songName = "conflict";
        int bp = 95;

        System.out.println("曲名: " + songName);
        System.out.println("前回BP: " + bp);

        bp = 82;

        System.out.println("今回BP: " + bp);
    }
}
