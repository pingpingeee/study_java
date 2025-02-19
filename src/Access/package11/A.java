package Access.package11;

public class A {
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    // 생성자
    public A(boolean b) {
    }

    // 오버로딩
    A(int b) { // default 접근지정자
    }

    private A(String s) { // private 접근지정자
    }
}
