package java_pjt.chapter05;

class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    // 오버라이딩(리턴타입, 메소드명, 매개변수 다 일치)
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    //    Shape p = new Line(); 업캐스팅
    static void paint(Shape shape) {
//        업캐스팅에 의해서 슈퍼클래스의 draw()메소드로 갔다가 오버라이딩 되어 Line으로 이동
//        동적바인딩
        shape.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape()); //Shape
        paint(new Rect()); // Rect(업캐스팅, 오버라이딩)
        paint(new Circle()); // Circle(업캐스팅, 오버라이딩)
    }
}
