package java_pjt.question01;

import java.util.Scanner;

public class ExRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가로, 세로 길이 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1 * num2;

        System.out.println("사각형의 면적 : " + result);

        sc.close();
    }
}
