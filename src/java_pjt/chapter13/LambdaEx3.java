package java_pjt.chapter13;

interface MyFunction3 {
    void print();
}

public class LambdaEx3 {
    public static void main(String[] args) {
        MyFunction3 f = () -> System.out.println("hello");
        f.print();
        f = () -> System.out.println("ㅎ2");
        f.print();
    }
}
