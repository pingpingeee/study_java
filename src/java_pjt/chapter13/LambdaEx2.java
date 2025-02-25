package java_pjt.chapter13;

interface MyFunction2 {
    int calc(int x);
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 square = x -> x * x; // 매개변수 하나일 때는 () 생략가능

        System.out.println(square.calc(3));
    }
}
