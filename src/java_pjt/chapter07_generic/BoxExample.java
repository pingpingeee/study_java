package java_pjt.chapter07_generic;

public class BoxExample {
    public static void main(String[] args) {
        Box box1 = new Box();
        Object box2 = new Box();

        box1.setObject("홍길동");
        String name = (String) box1.getObject();
        System.out.println(name);

        box1.setObject(777);
        int num = (int) box1.getObject();
        System.out.println(num);

        box1.setObject(new Apple());
        Apple apple = (Apple) box1.getObject();
        System.out.println(apple);
    }
}