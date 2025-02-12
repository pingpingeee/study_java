package java_pjt.chapter02;

public class CircleArea {
    public static void main(String[] args) {
        double pi = 3.14;
        int radius = 10;

//        숫자 연산시 큰 타입을 따라가기에 int로 하면 오류발생
        double circle = pi * radius * radius;

        System.out.println(circle);
    }
}
