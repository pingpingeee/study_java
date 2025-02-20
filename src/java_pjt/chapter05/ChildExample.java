package java_pjt.chapter05;

public class ChildExample {
    public static void main(String[] args) {
//        Parent 클래스에 기본생성자 만들어서 호출하고,
//        Child 클래스에 기본생성자 만들어서 호출
//        업캐스팅(슈퍼클래스 타입으로 서브클래스 객체 생성)
        Parent parent = new Child();
        parent.field1 = "data1";
//        업캐스팅된 객체는 서브클래스 멤버 접근 불가
//        parent.field2 = "data2"; // 오류
        parent.method1();
        parent.method2();
//        업캐스팅된 객체는 서브클래스 멤버 접근 불가
//        parent.method3(); // 오류

        Child child = (Child) parent; // 다운캐스팅
//        다운캐스팅되어서 서브클래스 멤버 접근 가능
        child.filed2 = "yyy";
        child.method3();
    }
}
