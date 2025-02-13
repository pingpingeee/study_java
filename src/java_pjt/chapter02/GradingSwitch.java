package java_pjt.chapter02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GradingSwitch {
    public static void main(String[] args) {
        System.out.print("점수 입력 : ");
        Scanner sc = new Scanner(System.in);
        char grade;

        int score = sc.nextInt();
        switch (score / 10) {
            case 10:
                grade = 'A';
                break;
            case 9:
                grade = 'B';
                break;
            case 8:
                grade = 'C';
                break;
            case 7:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("학점 : " + grade);
    }
}
