package java_pjt.question01;

import java.util.Scanner;

public class ExExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원화 입력 : ");
        int won = sc.nextInt();

        System.out.println(won + "원은 $" + change1(won) + "입니다.");
        System.out.println(won + "원은 E" + change2(won) + "입니다.");
    }

    public static double change1(int won) {
        return (double) won / 1200;
    }

    public static double change2(int won) {
        return (double) won / 1500;
    }
}
