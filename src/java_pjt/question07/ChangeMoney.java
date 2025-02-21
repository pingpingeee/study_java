package java_pjt.question07;

import java.util.Scanner;

public class ChangeMoney {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = {50000, 10000, 1000, 100, 50, 10, 1};
        System.out.print("금액 입력 : ");
        int money = sc.nextInt();

        for (int i = 0; i < numArr.length; i++) {
            if (money / numArr[i] != 0) {
                System.out.println(numArr[i] + "원 짜리 : " + money / numArr[i]);
                money %= numArr[i];
            }
        }
    }
}
