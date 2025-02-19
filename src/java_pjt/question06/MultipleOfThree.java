package java_pjt.question06;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 10개 입력 : ");
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }

        System.out.print("3의 배수 : ");
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 3 == 0) System.out.print(numArr[i] + " ");
        }
    }
}
