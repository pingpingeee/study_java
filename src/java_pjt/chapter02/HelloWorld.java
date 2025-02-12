package java_pjt.chapter02;

//jvm => 자바가상기계
//jvm => public class를 찾아감 1번
//jvm => main 메소드를 찾아감 2번
public class HelloWorld {
    public static void main(String[] args) {
//        String message;
        String message = "헬로 월드";
        System.out.println(message);

        message = "헬로 투헬";
        System.out.println(message);
    }
}