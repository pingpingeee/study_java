package java_pjt.chapter04;

import java.util.Scanner;

/**
 * static 사용(필드, 메소드)
 * 클래스 이름으로 static 멤버 접근
 * 환율을 입력하여 100만원 => 몇달러?
 * 환율 -> 100달러가 몇원?
 */
class CurrencyConverter {
    private static double rate;

    public static void setRate(double rate) {
        CurrencyConverter.rate = rate;
    }

    //    환율 1300원 -> 1달러
    public static double toDollar(double won) {
        return won / rate;
    }

    //    환율 1300 * 1달러 = 1300원
    public static double toKWR(double dollar) {
        return dollar * rate;
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("환율(1달러) >> ");
        double rate = sc.nextDouble();
        CurrencyConverter.setRate(rate);
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
        System.out.println("100$s는 " + CurrencyConverter.toKWR(100) + "원 입니다.");
    }
}
