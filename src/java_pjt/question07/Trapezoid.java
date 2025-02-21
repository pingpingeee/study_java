package java_pjt.question07;

import java.util.Scanner;

public class Trapezoid {
    private int up;
    private int down;
    private int height;

//    public Trapezoid(int up, int down, int height) {
//        this.up = up;
//        this.down = down;
//        this.height = height;
//    }

    public double getArea() {
        return (up + down) * height / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>");
//        int up = sc.nextInt();
//        int down = sc.nextInt();
//        int height = sc.nextInt();
//        Trapezoid trapezoid = new Trapezoid(up, down, height);
        // 기본생성자로 가능
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.up = sc.nextInt();
        trapezoid.down = sc.nextInt();
        trapezoid.height = sc.nextInt();
        System.out.println("사다리 꼴의 면적 : " + trapezoid.getArea());
    }
}
