package java_pjt.chapter06;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ObjectPropertyEx {
    //    print()메소드 매개변수로 new Point(2, 3)이 들어와서 업캐스팅
    public static void print(Object object) { // Object obj = new Point(2, 3) => 업캐스팅
//        실행중인 클래스
        System.out.println(object.getClass()); // 클래스 패키지.클래스
        System.out.println(object.getClass().getName()); // 패키지.클래스
        System.out.println(object.hashCode()); // 객체의 서명(10진수 해시코드)
        System.out.println(object.toString()); // 패키지.클래스@16진수 해시코드
        System.out.println(object); // toString()생략 (문자열로 변환해서 출력)
    }

    public static void main(String[] args) {
        Point point = new Point(2, 3);
        print(point);
    }
}
