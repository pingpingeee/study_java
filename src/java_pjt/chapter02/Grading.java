package java_pjt.chapter02;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        System.out.print("점수 입력 : ");
        Scanner sc = new Scanner(System.in);
        char grade;

        int score = sc.nextInt();
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("학점 : " + grade);
    }
}
