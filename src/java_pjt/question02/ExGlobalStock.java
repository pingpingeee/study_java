package java_pjt.question02;

import java.util.Scanner;

public class ExGlobalStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("매수 금액 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("매도 금액 입력 : ");
        int num2 = sc.nextInt();

        double x = 0;
        if (num2 > num1) {
            x = (num2 - num1) * 0.22;
        }
        System.out.println("양도세 : " + x);
    }
}
