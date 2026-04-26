package ch02;
/**
* 1曲分の簡易リザルトメモを、複数行のレイアウトで表示する練習。
* 二重引用符を含む文字列を適切に表示する。
* 楽曲情報表示などに応用できる。
*/
public class ResultMemoDisplay {
    public static void main(String[] args) {
        String songName = "冥";
        String songDifficulty = "Another";
        String comment = "今日は \"BP更新狙い\" でプレイ";

        System.out.print("""
                              === Result Memo ===
                              """ +
                              "曲名: " + songName + "\n" +
                              "譜面: " + songDifficulty + "\n" +
                              "コメント: " + comment + "\n" +
                              """        
                              ------------------
                              """);
    }
}
