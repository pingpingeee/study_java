package java_pjt.question03;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 입력 : ");
        int num = sc.nextInt();
        String str = "";
        boolean multiple = false;

        if (num % 3 == 0) {
            str = "3의 배수\n";
            multiple = true;
        }
        if (num % 5 == 0) {
            str += "5의 배수\n";
            multiple = true;
        }
        if (num % 8 == 0) {
            str += "8의 배수\n";
            multiple = true;
        }
        if (multiple == false) System.out.println("어느 배수도 아님");

        System.out.println(str);
    }
}
