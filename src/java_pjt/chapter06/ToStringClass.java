package java_pjt.chapter06;

class Point2 {
    private int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2(" + x + ", " + y + ")";
    }
}

public class ToStringClass {
    public static void main(String[] args) {
        Point2 point = new Point2(2, 3);
        System.out.println(point);
        System.out.println(point.toString());
    }
}
