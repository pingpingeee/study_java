package java_pjt.chapter03;

import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        System.out.print("구구단 중 출력하고 싶은 단 입력 : ");
        n = sc.nextInt();

        while (i <= 9) {
            System.out.println(n + " * " + i + " = " + n * i);
            i++;
        }
    }
}
