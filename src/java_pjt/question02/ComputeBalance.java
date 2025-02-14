package java_pjt.question02;

import java.util.Scanner;

public class ComputeBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        구매금액
        int purchaseAmout;
//        청구금액
        int balance = 0;

        System.out.print("구매 금액 입력 : ");
        purchaseAmout = sc.nextInt();

        if (purchaseAmout >= 300000) {
            balance = purchaseAmout - 30000;
        } else if (purchaseAmout >= 100000) {
            balance = purchaseAmout - 5000;
        } else {
            balance = purchaseAmout;
        }
        System.out.println("구매금액 : " + purchaseAmout);
        System.out.println("청구금액 : " + balance);
    }
}
