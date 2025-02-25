package java_pjt.question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇개 ? ");
        int n = sc.nextInt();
        int[] numArr = new int[n];
        Random random = new Random();

        if (n > 100) {
            System.out.println("100이상의 수 입력");
        } else {
            for (int i = 0; i < numArr.length; i++) {
                numArr[i] = random.nextInt(100) + 1;
                if (i == 0) {
                    System.out.print(numArr[i] + "\t");
                } else {
                    if (i % 10 == 0) {
                        System.out.println();
                    }
                    System.out.print(numArr[i] + "\t");
                }
            }
        }
    }
}
