package java_pjt.question01;

import java.util.Scanner;

public class DivAndRemains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2자리 수 정수 입력 : ");
        int num1 = sc.nextInt();
        int b = num1 / 10;

        int s = num1 % 10;
//        int s = ((num1 * 10) - (b * 10)) / 100;

        if (b == s) {
            System.out.println("같음");
        } else {
            System.out.println("틀림");
        }
    }
}
