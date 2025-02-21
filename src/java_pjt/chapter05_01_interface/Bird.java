package java_pjt.chapter05_01_interface;

abstract class Bird extends Animal {
    public int wing = 2;

    public void walk() {
        System.out.println("walk");
    }

    public void eat() {
        System.out.println("eat");
    }
}
