package java_pjt.chapter05;

/**
 * Point클래스 : (x, y) 한점을 표현
 * Point 클래스를 상속받는 ColorPoint클래스(색을 가진 점)
 */
class Point {
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color);
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point point = new Point(); // 객체생성, 멤버4개, 생성자호출
        point.set(1, 2);
        point.showPoint();

        ColorPoint colorPoint = new ColorPoint(); // 객체생성, 멤버3개 + 상속4개
        colorPoint.set(3, 4);
        colorPoint.showPoint();
        colorPoint.setColor("red");
        colorPoint.showColorPoint();
    }
}
