package java_pjt.question03;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 5개 입력 : ");
        int num1 = 0;
        int result = 0;

        for (int i = 0; i < 5; i++) {
            num1 = sc.nextInt();
            if (num1 >= 0) result += num1;

        }
        System.out.println("양수의 합 : " + result);
    }
}
