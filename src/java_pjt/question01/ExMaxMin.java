package java_pjt.question01;

import java.util.Scanner;

public class ExMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = num1, min = num1;
        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        } else if (num3 < min) {
            min = num3;
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
