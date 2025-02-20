package java_pjt.question06;

import java.util.Random;

public class RandomTen {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numArr = new int[10];
        int avg = 0;

        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = random.nextInt(10) + 1;
            avg += numArr[i];
            System.out.print(numArr[i] + " ");
        }
        System.out.println("\n평균 : " + avg / numArr.length);
    }
}
