package java_pjt.question02;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");

        int num = sc.nextInt();
        int hour = num / 3600;
        int min = (num / 60) % 60;
        int sec = num % 60;

        System.out.println(num + "초는 " + hour + "시간, " + min + "분, " + sec + "초 입니다.");
    }
}
