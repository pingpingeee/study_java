package java_pjt.question07;

import java.util.Random;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] numArr = new int[4][4];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[0].length; j++) {
                numArr[i][j] = new Random().nextInt(10)+1;
            }
        }
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[0].length; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
