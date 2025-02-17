package java_pjt.question04;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양수 5개 입력 : ");
        int[] numArr = new int[5];
        int max = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            if (numArr[i] > max) max = numArr[i];
        }
        System.out.println("가장 큰 수 : " + max);
    }
}
