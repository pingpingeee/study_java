package java_pjt.question01;

import java.util.Scanner;

public class ExSumMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("3자리 수 정수 입력 : ");
        int num1 = sc.nextInt();
        int n1 = num1 / 100;
        int n2 = (num1 - (n1 * 100)) / 10;
        int n3 = num1 % 10;

        System.out.println("100의 자리와 10의 자리 합 : " + (n1 + n2));
        System.out.println("10의 자리와 1의 자리 곱 : " + (n2 * n3));

    }
}
