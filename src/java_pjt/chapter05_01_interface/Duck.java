package java_pjt.chapter05_01_interface;

//public class Duck extends Bird {
public class Duck extends Bird implements Swim2, Fly {
//    public void swim() {
//        System.out.println("ducks swim");
//    }

//    public void fly() {
//        System.out.println("ducks fly");
//    }

    @Override
    public void swim() {
        System.out.println("ducks swim");
    }

    @Override
    public void fly() {
        System.out.println("ducks fly");
    }
}
