package java_pjt.question02;

import java.util.Scanner;

public class TaxiFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fare = 0;
        int income = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("요금 입력 : ");
            fare = sc.nextInt();
            income += fare;
        }
        System.out.println("총 수입 : " + income);
    }
}
