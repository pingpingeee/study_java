package java_pjt.chapter05_01_interface;

public class Main {
    public static void main(String[] args) {
//        new Animal(); // 추상클래스는 객체 생성 X
        Animal a; // 참조변수 선언은 가능
//        new Bird(); // 추상클래스는 객체 생성 X
        Penguin p = new Penguin();
        p.swim(); // 멤버 5개 (life, wing, walk(), eat(), swim()

        Bird p2 = new Penguin(); // 업캐스팅
//        p2.swim(); // 업캐스팅은 슈퍼클래스의 멤버만 접근 가능(오류 발생)
        p2.walk();// 업캐스팅은 슈퍼클래스의 멤버만 접근 가능
        Penguin p3 = (Penguin) p2; // 다운캐스팅
        p3.swim();// 다운캐스팅은 모든 멤버 접근 가능

        Bird d = new Duck(); // 업캐스팅
        d.eat(); // 업캐스팅은 슈퍼클래스의 멤버만 접근 가능
        Duck d2 = (Duck) d; // 다운캐스팅
        d2.fly(); // 다운캐스팅은 모든 멤버 접근 가능

//        추상클래스를 참조변수 선언(슈퍼클래스)
        Animal d3 = new Duck(); // 업캐스팅은 슈퍼클래스의 멤버만 접근가능
    }
}
