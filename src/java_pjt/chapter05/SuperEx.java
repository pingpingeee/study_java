package java_pjt.chapter05;

/**
 * super()사용
 */
class Point2 {
    private int x, y;

    public Point2() {
        this.x = this.y = 0;
    }

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class ColorPoint2 extends Point2 {
    private String color;

    public ColorPoint2(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}

public class SuperEx {
    public static void main(String[] args) {
        ColorPoint2 colorPoint2 = new ColorPoint2(5, 6, "blue");
        colorPoint2.showColorPoint();
    }
}
