package java_pjt.chapter04;

// default 접근 지정자
class Calc {
    //    non static(인스턴스)멤버는 객체를 생성해야 사용됨
//    public int abs(int a) {
    public static int abs(int a) {
        return a > -0 ? a : -a; // 절대값 반환
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int min(int a, int b) {
        return a > b ? b : a;
    }
}

public class CalcEx {
    public static void main(String[] args) {
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));
    }
}
