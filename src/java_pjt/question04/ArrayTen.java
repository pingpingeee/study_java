package java_pjt.question04;

import java.util.Scanner;

public class ArrayTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        System.out.print(numArr.length + "개 정수 입력 : ");
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            sum += numArr[i];
        }
        System.out.println("합계 : " + sum);
    }
}
