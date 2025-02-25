package java_pjt.chapter13;

import java.util.function.BiFunction;

class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class BiFunctionTest {
    public static void main(String[] args) {
//        BiFunction 인터페이스는 매개변수 2개를 받고 1개를 반환
//        BiFunction<Integer, Integer, Integer> obj = (x1, x2) -> x1 + x2;
        BiFunction<Integer, Integer, Integer> obj = Calculator::add; // 구현되어 있는 메소드 참조
        int result = obj.apply(10, 20);
        System.out.println(result);
    }
}
