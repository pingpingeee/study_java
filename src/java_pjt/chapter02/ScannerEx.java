package java_pjt.chapter02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력");

//        Scanner => 클래스
//        sc => 참조변수(레퍼런스)
//        new Scanner() => 객체생성
//        System.in => 매개변수(인자, 파라미터, 아규먼트)
        Scanner sc = new Scanner(System.in);

//        next() => 문자열 입력 받는 메소드
        String name = sc.next();
        System.out.println("이름 : " + name);

//        입력 받을 때 스페이스나 탭으로 구분해서 토큰단위로 받음
        String city = sc.next();
        System.out.println("도시 : " + city);
        int age = sc.nextInt();
        System.out.println("나이 : " + age + "살");
        double weight = sc.nextDouble();
        System.out.println("체중 : " + weight);
        boolean single = sc.nextBoolean();
        System.out.println("독신여부 : " + single);

        sc.close();
    }
}
