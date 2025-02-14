package java_pjt.question03;

import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("10 ~ 99 사이의 정수 입력 : ");
//        int num = sc.nextInt();
        int num1 = 36;
        int x = num1 / 10;
        int y = num1 % 10;
        int count = 0;

        if (x % 3 == 0) {
            count++;
        }
        if (y % 3 == 0 && y != 0) {
            count++;
        }
        if (count == 2) {
            System.out.println("박수짝짝");
        } else if (count == 1) {
            System.out.println("박수짝");
        } else {
            System.out.println("박수없음");
        }

//        if (x == 3 && y == 3 || x == 3 && y == 6 || x == 3 && y == 9) {
//            System.out.println("박수짝짝");
//        } else if (x == 6 && y == 3 || x == 6 && y == 6 || x == 6 && y == 9) {
//            System.out.println("박수짝짝");
//        } else if (x == 9 && y == 3 || x == 9 && y == 6 || x == 9 && y == 9) {
//            System.out.println("박수짝짝");
//        } else if (x == 3 || x == 6 || x == 9 || y == 3 || y == 6 || y == 9) {
//            System.out.println("박수짝");
//        }
    }
}
