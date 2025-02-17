package java_pjt.question04;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5개 정수 입력 : ");
        int[] numArr = new int[5];
        double sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            sum += numArr[i];
        }

        System.out.print("평균 : " + sum / numArr.length);
    }
}
