package java_pjt.question03;

import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("부정해위 여부(true or false) : ");
        boolean boo = sc.nextBoolean();
        System.out.print("출석률(0 ~ 100 사이의 정수 값) : ");
        int check = sc.nextInt();
        System.out.print("총점(0 ~ 100 사이의 정수 값) : ");
        int num = sc.nextInt();

        String grade;
        if (boo == true) {
            grade = "F";
        } else if (check < 80) {
            grade = "F";
        } else {
            if (num >= 90) {
                grade = "A";
            } else if (num >= 80) {
                grade = "B";
            } else if (num >= 70) {
                grade = "C";
            } else if (num >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println("학점 : " + grade);
    }
}