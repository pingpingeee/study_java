package java_pjt.chapter02;

public class AssignmentIncDecOperator {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;

        a += 3;
        b *= 3;
        c %= 2;
        System.out.println("a : " + a + ", b : " + b + ", c : " + c);

        int d = 3;
//        d를 먼저 a에 넘기고, 1을 증가
//        뒤에 붙은 ++ / -- 는 후위 연산자
        a = d++; // a : 3, d : 4
        System.out.println("a : " + a + ", d = " + d);

        d = 3;
//        전위 연산자 사용
        a = ++d; // a : 4, d : 4
        System.out.println("a : " + a + ", d = " + d);

        d = 3;
//        후위 연산자 사용
        a = d--; // a : 3, d : 2
        System.out.println("a : " + a + ", d = " + d);

        d = 3;
//        전위 연산자 사용
        a = --d; // a : 2, d : 2
        System.out.println("a : " + a + ", d = " + d);
    }
}
