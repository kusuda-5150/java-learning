package ch02;

public class Pr3_A {
    public static void main(String[] args) {
        String songName = "灼熱Beach Side Bunny";
        int totalBpBefore = 210;
        int playCountBefore = 2;

        System.out.println("曲名: " + songName);
        System.out.println("total BP before: " + totalBpBefore);

        int currentBp = 80;
        int playCountAfter = playCountBefore + 1;

        System.out.println("current BP: " + currentBp);
        System.out.println("play count after: " + (playCountAfter));
        System.out.println("average BP after: " + ((double) (totalBpBefore + currentBp) / playCountAfter));
    }
}
