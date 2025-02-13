package java_pjt.question01;

import java.util.Scanner;

public class Won2Dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원화 입력 : ");
        int won = sc.nextInt();
        double result = change(won);

        System.out.println(won + "원은 $" + result + "입니다.");
    }

    public static double change(int won) {
        return (double) won / 1100;
    }
}
