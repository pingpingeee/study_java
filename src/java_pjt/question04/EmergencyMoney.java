package java_pjt.question04;

import java.util.Scanner;

public class EmergencyMoney {
    public static void main(String[] args) {
        final int hund = 120000;
        final int ten = 12000;
        Scanner sc = new Scanner(System.in);
        System.out.print("가구수 입력 : ");
        int fam = sc.nextInt();
        int money = 0;

        if (fam == 1) money = 400000;
        if (fam == 2) money = 600000;
        if (fam == 3) money = 800000;
        if (fam == 4) money = 1000000;

        int x = money / hund;
        int y = (money % hund) / ten;

        if (x > 0) System.out.println("100달러 : " + x);
        if (y > 0) System.out.println("10달러 : " + y);
    }
}
