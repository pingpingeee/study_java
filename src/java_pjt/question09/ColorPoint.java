package java_pjt.question09;

class Point {
    private int x, y;

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
    }

    public static void main(String[] args) {
        ColorPoint colorPoint = new ColorPoint(5, 5, "YELLOW");
        colorPoint.setXY(10, 20);
        colorPoint.setColor("RED");
        String str = colorPoint.toString();
        System.out.println(str + "입니다.");
    }

    private void setXY(int x, int y) {
        move(x, y);
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "색의 (" + getX() + ", " + getY() + ")";
    }
}
