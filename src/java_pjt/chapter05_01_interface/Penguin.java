package java_pjt.chapter05_01_interface;

// 생명1, 날개2, 걷다, 먹는다 + 수영한다(인터페이스)
public class Penguin extends Bird implements Swim2 {
    public void swim() {
        System.out.println("penguins swim.");
    }
}
