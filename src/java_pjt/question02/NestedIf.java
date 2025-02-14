package java_pjt.question02;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("학년 입력 : ");
        int num2 = sc.nextInt();

        switch (num2) {
            case 1:
            case 2:
            case 3:
                if (num1 >= 60) {
                    System.out.println("합격");
                } else {
                    System.out.println("불합격");
                }
                break;

            case 4:
                if (num1 >= 70) {
                    System.out.println("합격");
                } else {
                    System.out.println("불합격");
                }
                break;
            default:
                System.out.println("잘못된 값 입력");
                break;
        }
    }
}
