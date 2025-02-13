package java_pjt.chapter02;

import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        System.out.print("수 입력 : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println("3의 배수");
        } else {
            System.out.println("3의 배수 아님");
        }
    }
}
