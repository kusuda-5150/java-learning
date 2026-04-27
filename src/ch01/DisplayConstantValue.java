package ch01;
/*
 * データに含まれる固定値を定数として定義し、画面に表示する。
 * バージョンアップ時などの実装エラーを回避する。
 *
 */
public class DisplayConstantValue {
    public static void main(String[] args) {
        final int graphHistory = 20;
        final double hardGaugeCap = 100.0;
        String title = "beatoraja BP Viewer Java Practice";

        System.out.println("tool:" + title);
        System.out.println("graph history: " + graphHistory);
        System.out.println("hard gauge cap: " + hardGaugeCap + "%");
    }

}
