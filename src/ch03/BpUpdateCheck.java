package ch03;
/**
 * 今回BPと保存済みの最小BPを比較し、BP更新の有無を判定する。
 * 更新があった場合は、保持している最小BPを今回BPで上書きする。
 */
public class BpUpdateCheck {
    public static void main(String[] args) {
        String songName = "conflict";
        int bestBp = 95;
        System.out.println("曲名: " + songName);
        System.out.println("previous BP: " + bestBp);
        int currentBp = 82;
        System.out.println("current BP: " + currentBp);
        if (bestBp > currentBp) {
            bestBp = currentBp;
            System.out.println("result: BP更新");
        } else {
            System.out.println("result: BP更新なし");
        }


    }
}
