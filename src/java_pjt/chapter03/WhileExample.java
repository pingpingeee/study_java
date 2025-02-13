package java_pjt.chapter03;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 후 마지막에 -1 입력 : ");
        int count = 0, sum = 0;
        int n = sc.nextInt();

        while (n != -1) {
            sum += n;
            count++;
            n = sc.nextInt();
        }
        if (count == 0) {
            System.out.println("입력된 수 없음");
        } else {
            System.out.println("정수의 갯수 : " + count + "개");
            System.out.println("평균 : " + (double) sum / count);
        }

    }
}
