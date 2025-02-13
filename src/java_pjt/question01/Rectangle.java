package java_pjt.question01;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점(x, y)의 좌표 입력 : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
            System.out.println("(" + x + "," + y + ")는 사각형 안에 있음");
        } else {
            System.out.println("(" + x + "," + y + ")는 사각형 안에 없음");
        }
    }
}
