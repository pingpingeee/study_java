package java_pjt.question02;

import java.util.Scanner;

public class ArithmeticExIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산 : ");
        int num1 = sc.nextInt();
        String x = sc.next();
        int num2 = sc.nextInt();
        int result = 0;

        if (x.equals("+")) {
            result = num1 + num2;
        } else if (x.equals("-")) {
            result = num1 - num2;
        } else if (x.equals("*")) {
            result = num1 * num2;
        } else if (x.equals("/")) {
            result = num1 / num2;
        }
        System.out.println(num1 + x + num2 + "의 계산 결과 : " + result);
    }
}
