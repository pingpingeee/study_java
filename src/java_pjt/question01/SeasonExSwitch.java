package java_pjt.question01;

import java.util.Scanner;

public class SeasonExSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력(1 ~ 12) : ");
        int n = sc.nextInt();
        String season = "";

        switch (n) {
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "겨울";
                break;
        }
        System.out.println(season);
    }
}
