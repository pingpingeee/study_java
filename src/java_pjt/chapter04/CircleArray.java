package java_pjt.chapter04;

// 동일한 패키지에서 중복된 클래스이름이면 오류
// 나는 Circle파일이 없어서 안생김
class Circle3 {
    int radius;

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public Circle3(int radius) {
        this.radius = radius;
    }
}

class Circle4 {
}
// public 2개 이상은 오류
//public class Circle5{}


public class CircleArray {
    public static void main(String[] args) {
        Circle3[] c; // 객체 배열 Circle3을 참조변수 c로 선언
        c = new Circle3[5];

        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle3(i);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].getArea());
        }
    }
}
