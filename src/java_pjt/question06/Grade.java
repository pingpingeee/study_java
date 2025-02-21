package java_pjt.question06;

import java.util.Scanner;

public class Grade {
    private int m, s, e;

    public Grade(int m, int s, int e) {
        this.m = m;
        this.s = s;
        this.e = e;
    }

    public int average() {
        return (m + s + e) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 : ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int eng = sc.nextInt();
        Grade me = new Grade(math, science, eng);
        System.out.println("평균 : " + me.average());
    }
}
