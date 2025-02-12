package java_pjt.chapter02;

public class LongOperationExample {
    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000;

//        연산되면서 가장 큰 타입인 long타입을 int로 변환
        int result = (int) (value1 + value2 + value3);

        System.out.println(result);
    }
}
