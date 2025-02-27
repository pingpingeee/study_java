package java_pjt.question09;

interface Shape {
    final double PI = 3.14;

    void draw();

    double getArea();

    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
class Circle1 implements Shape {
    int x;

    public Circle1(int x) {
        this.x = x;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + x + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return 10 * 10 * PI;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape donut = new Circle1(10);
        donut.redraw();
        System.out.println("면적 : " + donut.getArea());
    }
}
