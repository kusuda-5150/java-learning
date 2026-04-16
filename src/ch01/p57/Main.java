package ch01.p57;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14;
        int pie = 5;
        System.out.println("半径" + pie + "cmのパイの面積は");
        System.out.println(PI * pie * pie);
        System.out.println("パイの半径を倍にします");
        pie = pie * 2;
        System.out.println("半径" + pie + "cmのパイの面積は");
        System.out.println(PI * pie * pie);
    }
}
