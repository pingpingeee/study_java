package java_pjt.question01;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1) {
            System.out.println("삼각형이 됩니다.");
        } else {
            System.out.println("삼각형이 안 됩니다.");
        }
    }
}
