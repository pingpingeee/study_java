package java_pjt.question09;

class PointTwo {
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

    public PointTwo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ColorPointTwo extends PointTwo {
    private String color;

    public ColorPointTwo(int x, int y) {
        super(x, y);
    }

    public ColorPointTwo() {
        this.color = "BLACK";
        super(0, 0);
    }

    public static void main(String[] args) {
        ColorPointTwo colorPointTwo = new ColorPointTwo(); // BLACK색에 (0, 0)위치의 점
        System.out.println(colorPointTwo.toString() + "입니다.");

        ColorPointTwo cp = new ColorPointTwo(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
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
