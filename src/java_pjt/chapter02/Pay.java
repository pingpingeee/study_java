package java_pjt.chapter02;

import java.util.Random;
import java.util.Scanner;

// 시간 입력 받고 임금 계산
public class Pay {
    public static void main(String[] args) {
        final int RATE = 10000;
        int hour;
        int pay;
        System.out.print("시간 입력 : ");
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();

        if (hour > 8) {
            pay = (int) (RATE * 8 + (RATE * (hour - 8) * 1.5));
        } else {
            pay = RATE * hour;
        }
        System.out.println("급여 : " + pay);
    }
}
