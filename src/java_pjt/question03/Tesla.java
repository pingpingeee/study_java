package java_pjt.question03;

import java.util.Scanner;

public class Tesla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("매수 수량 입력 : ");
        int num = sc.nextInt();
        int sum = num * 520;

        // 100달러
        int x = sum / 100;
        // 10달러
        int y = (sum / 10) % 100;

        // if-else 가 아닌 if문 두개를 써서 사용
        // if (x > 0)를 해도 무방함 << 100달러가 1장 이상일때
        // if (y > 0)를 해도 무방함 << 10달러가 1장 이상일때
        if (sum % 100 == 0) {
            System.out.println("100달러 : " + x + "매");
        } else {
            System.out.println("100달러 : " + x + "매");
            System.out.println("10달러 : " + y + "매");
        }
    }
}
