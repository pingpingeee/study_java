package java_pjt.chapter02;

import java.util.Scanner;

public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 80) System.out.println("합격");

    }
}
