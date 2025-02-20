package java_pjt.chapter05;

public class InstanceofExample {
    public static void method1(Parent parent) {
//        Parent parent = new Child(); => child 객체를 판단
//        instanceof => 객체가 해당 클래스 타입인지 판단(참/거짓)
        if (parent instanceof Child) {
//            다운캐스팅
            Child child = (Child) parent;
            System.out.println("메소드1 - Child변환 성공");
        } else {
            System.out.println("메소드1 - Child변환 실패");
        }
    }

    public static void main(String[] args) {
//        업캐스팅
        Parent parent = new Child();
        method1(parent);
    }
}
