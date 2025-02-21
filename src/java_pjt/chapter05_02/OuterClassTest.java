package java_pjt.chapter05_02;

class OuterClass { // 외부클래스
    //    private String secret = "Time is money";
    private String secret = "Time is money";

    public OuterClass() { // 2. 달걀의 생성자 호출됨
//        new InnerClass(); // 3. 노른자 객체 생성
        InnerClass innerClass = new InnerClass();
        innerClass.method();
    }

    public class InnerClass { // 내부(중첩 or inner)클래스

        public InnerClass() { // 4. 노른자의 생성자 호출됨
            System.out.println("내부 클래스의 생성자");
        }

        public void method() {
            System.out.println(secret);
        }
    }
}

public class OuterClassTest {
    public static void main(String[] args) {
//        new OuterClass(); // 1. 달걀 객체 생성
        OuterClass outerClass = new OuterClass();
//        new InnerClass(); // 내부클래스 접근 불가
//        outerClass.secret = ""; // 접근제한(private이면)
    }
}
