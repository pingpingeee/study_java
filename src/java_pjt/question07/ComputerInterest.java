package java_pjt.question07;

import java.util.Scanner;

public class ComputerInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 원금
        int principal;
        // 연이율
        double rate;
        // 원리금
        double balance = 0;
        // 연도수
        int years;

        System.out.print("원금 입력 : ");
        principal = sc.nextInt();
        balance = principal;
        System.out.print("연이율 입력 : ");
        rate = sc.nextDouble();
        System.out.println("연도수\t원리금");

        for (years = 0; balance <= principal * 2; years++) {
            balance = balance * (1.0 + rate / 100.0);
            System.out.println((years + 1) + "\t\t" + balance);
        }
        System.out.println("필요한 연도수 : " + years);
    }
}
