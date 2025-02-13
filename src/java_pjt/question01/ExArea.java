package java_pjt.question01;

import java.util.Scanner;

public class ExArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        double result = 0;
        if (num3 > 0) {
            result = ((num1 + num2) * num3) / 2;
            System.out.println("사다리 꼴의 넓이 : " + result);
        } else if (num3 == 0) {
            result = (num1 *num2) / 2;
            System.out.println("삼각형의 넓이 : " + result);
        }
    }
}
