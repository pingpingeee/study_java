package java_pjt.question01;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double PI = 3.14;

        System.out.print("반지름 입력 : ");
        int radius = sc.nextInt();

        double result = radius * radius * Math.PI;
        System.out.println("원의 면적 : " + result);

        sc.close();
    }
}
