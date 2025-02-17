package java_pjt.question04;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양수 7개 입력 : ");
        int[] numArr = new int[7];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            if (numArr[i] < min) min = numArr[i];
        }
        System.out.println("가장 작은 수 : " + min);
    }
}
