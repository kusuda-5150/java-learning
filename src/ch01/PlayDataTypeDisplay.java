package ch01;

/**
 * スコアログから読み取った各値を適切なデータ型に格納する練習。
 * 譜面ハッシュ文字列、プレイ日時、ノーツ数、スコア率、クリアフラグ、クリアランプをそれぞれ格納する。
 * 将来、DBや履歴データをJava側で扱うための型選択の基礎を確認する。
 */
public class PlayDataTypeDisplay {
    public static void main(String[] args) {
        String sha256 = "abc123def456";
        long date = 1713868800000L;
        int notes = 2100;
        double scoreRate = 91.23;
        boolean isHardClear = true;
        char lampMark = 'H';

        System.out.println("sha256: " + sha256);
        System.out.println("date: " + date);
        System.out.println("notes: " + notes);
        System.out.println("scoreRate: " + scoreRate);
        System.out.println("isHardClear: " + isHardClear);
        System.out.println("lampMark: " + lampMark);
    }

}
