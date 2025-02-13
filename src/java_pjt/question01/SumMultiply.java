package java_pjt.question01;

import java.util.Scanner;

public class SumMultiply {
    public static void main(String[] args) {
        System.out.print("2개의 정수 입력 : ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("두 수의 합 : " + (num1 + num2));
        System.out.println("두 수의 곱 : " + num1 * num2);
    }
}
