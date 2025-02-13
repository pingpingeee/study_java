package java_pjt.chapter02;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("주사위의 눈 : " + rollDie());
    }

    public static int rollDie() {
//        Random random = new Random();
        int x = (int) (6 * Math.random());
        return x + 1;
    }
}
