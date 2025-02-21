package java_pjt.chapter05_01_interface;

public class Main {
    public static void main(String[] args) {
//        new Animal(); // 추상클래스는 객체 생성 X
        Animal animal; // 참조변수 선언은 가능
//        new Bird(); // 추상클래스는 객체 생성 X
        Penguin penguin1 = new Penguin();
        penguin1.swim(); // 멤버 5개 (life, wing, walk(), eat(), swim()

        Bird penguin2 = new Penguin(); // 업캐스팅
//        p2.swim(); // 업캐스팅은 슈퍼클래스의 멤버만 접근 가능(오류 발생)
        penguin2.walk();// 업캐스팅은 슈퍼클래스의 멤버만 접근 가능
        Penguin penguin3 = (Penguin) penguin2; // 다운캐스팅
        penguin3.swim();// 다운캐스팅은 모든 멤버 접근 가능

        Bird duck1 = new Duck(); // 업캐스팅
        duck1.eat(); // 업캐스팅은 슈퍼클래스의 멤버만 접근 가능
        Duck duck2 = (Duck) duck1; // 다운캐스팅
        duck2.fly(); // 다운캐스팅은 모든 멤버 접근 가능

//        추상클래스를 참조변수 선언(슈퍼클래스)
        Animal duck3 = new Duck(); // 업캐스팅은 슈퍼클래스의 멤버만 접근가능
        int x = duck3.life;
        System.out.println("x => " + x);

//        new Swim2(); // 인터페이스는 객체 생성 X
        Swim2 swim = new Penguin(); // 인터페이스를 참조변수 선언
        swim.swim();

        // 인터페이스가 인터페이스 배열 2개를 가리킨다.
        // 객체배열과 형태가 비슷
        Swim2[] swim2 = new Swim2[2];
        swim2[0] = new Penguin();
        swim2[1] = new Duck();
        swim2[0].swim();
        swim2[1].swim();

    }
}
