package java_pjt.question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray2 {
    public static boolean ex(int[] a, int to, int r) {
        for (int i = 0; i < to; i++) {
            if (a[i] == r) {
                return true;
            }
        }
        return false;
    }

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
                int r = random.nextInt(100) + 1;
                if (ex(numArr, i, r)) {
                    i--;
                    continue;
                } else {
                    numArr[i] = r;
                }
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