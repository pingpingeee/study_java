package java_pjt.question03;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("exit을 입력하면 종료");

        while (true) {
            System.out.print("입력 : ");
            String str = sc.next();
            if (str.equals("exit") || str.equals("EXIT")) break;
        }
    }
}
