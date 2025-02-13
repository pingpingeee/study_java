package java_pjt.question01;

import java.util.Scanner;

public class SeasonExIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력(1 ~ 12) : ");
        int n = sc.nextInt();
        String season = "";

        if (n >= 3 && n <= 5) {
            season = "봄";
        } else if (n >= 6 && n <= 8) {
            season = "여름";
        } else if (n >= 9 && n <= 11) {
            season = "가을";
        } else {
            season = "겨울";
        }
        System.out.println(season);
    }
}

