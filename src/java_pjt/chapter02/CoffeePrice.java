package java_pjt.chapter02;

import java.util.Scanner;

public class CoffeePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        String order = sc.next();
        int price = 0;

        switch (order) {
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                price = 3500;
            case "아메리카노":
                price = 2000;
                break;
            default:
                System.out.println("메뉴에 없음");
                break;
        }
        if (price != 0) {
            System.out.println(order + "는 " + price + "입니다.");
        } else {
            System.out.println("나가");
        }
    }
}
