package java_pjt.chapter13;

interface MyFunction4 {
    int calc(int x, int y);
}

public class LambdaEx4 {
    public static void main(String[] args) {
        printMultiply(3, 4, (x, y) -> x * y); // 람다식 ((x, y) -> x * y)을 매개변수로 전달
    }

    // 메소드 매개변수로 인터페이스 객체를 받음
    // f로 (x, y) -> x * y 람다식 전달받음
    // MyFunction4 f=(x, y) -> x * y
    static void printMultiply(int x, int y, MyFunction4 function4) {
        System.out.println(function4.calc(x, y));
    }
}
