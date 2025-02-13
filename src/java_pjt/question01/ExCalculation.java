package java_pjt.question01;

import java.util.Scanner;

public class ExCalculation {
    public static void main(String[] args) {
        System.out.print("2개의 실수 입력 : ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();

        System.out.println("두수의 덧셈 : " + (num1 + num2));
        System.out.println("두수의 뺄셈 : " + (num1 - num2));
        System.out.println("두수의 곱셈 : " + (num1 * num2));
        System.out.println("두수의 나눗셈 : " + (num1 / num2));
    }
}
