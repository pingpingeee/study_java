package java_pjt.question04;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액 입력 : ");
        int num = sc.nextInt();

        if (num / 50000 != 0) {
            System.out.println("오만원권 " + num / 50000 + "매");
            num %= 50000;
        }
        if (num / 10000 != 0) {
            System.out.println("만원권 " + num / 10000 + "매");
            num %= 10000;
        }
        if (num / 1000 != 0) {
            System.out.println("천원권 " + num / 1000 + "매");
            num %= 1000;
        }
        if (num / 100 != 0) {
            System.out.println("백원 " + num / 100 + "개");
            num %= 100;
        }
        if (num / 50 != 0) {
            System.out.println("오십원 " + num / 50 + "개");
            num %= 50;
        }
        if (num / 10 != 0) {
            System.out.println("십원 " + num / 10 + "개");
            num %= 10;
        }
        if (num / 1 != 0) {
            System.out.println("일원 " + num / 1 + "개");
            num %= 1;
        }
    }
}
