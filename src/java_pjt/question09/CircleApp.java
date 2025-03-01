package java_pjt.question09;

class Circle {
    int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle(" + x + ", " + y + ") 반지름" + radius;
    }

    public boolean equals(Circle circle) {
        return circle.x == x && circle.y == y;
    }
}

public class CircleApp {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 30);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);

        if (a.equals(b)) System.out.println("같은 원");
        else System.out.println("서로 다른 원");
    }
}
