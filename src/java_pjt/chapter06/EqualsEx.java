package java_pjt.chapter06;

class Point3 {
    private int x, y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //    equals를 오버라이딩해서 객체의 값을 비교
    @Override
    public boolean equals(Object object) {
        Point3 point3 = (Point3) object;
        if (x == point3.x && y == point3.y) {
            return true;
        } else {
            return false;
        }
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        Point3 a = new Point3(2, 3);
        Point3 b = new Point3(2, 3);
        Point3 c = new Point3(3, 4);

        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }

//        equals => 기본은 객체를 비교
//        오버라이딩한 equals => 객체의 값을 비교
        if (a.equals(b)) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is equal not to b");
        }

        if (a.equals(c)) {
            System.out.println("a is equal to c");
        } else {
            System.out.println("a is equal not to c");
        }
    }
}
