package ch01;
/**
 * 統計ツールで扱う固定設定値を定数として定義し表示する。
 * バージョンアップ時などで固定値を誤って変更してしまう問題を避ける。
 */
public class ConstantValueDisplay {
    public static void main(String[] args) {
        final int graphHistory = 20;
        final double hardGaugeCap = 100.0;
        String title = "beatoraja BP Viewer Java Practice";

        System.out.println("tool:" + title);
        System.out.println("graph history: " + graphHistory);
        System.out.println("hard gauge cap: " + hardGaugeCap + "%");
    }

}
