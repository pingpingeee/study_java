package java_pjt.chapter02;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
//        int 타입을 char로 바로 저장하면 오류(작은 타입에 큰타입을 못 넣음)
//        char charValue = intValue;
//        형변환(캐스팅)을 해줘야함
        char charValue = (char) intValue;

        System.out.println("int -> char : " + charValue);

//        long longValue = 500;
        long longValue = 5000000000L;
//        intValue = longValue;
        intValue = (int) longValue;
//        long타입 숫자가 int로 변환하면서 잘림

        System.out.println("long -> int : " + intValue);
        double doubleValue = 3.14;
//        실수에서 정수로 변환
        intValue = (int) doubleValue;
//        3.14에서 소수점이 잘려서 3 저장
        System.out.println("double -> int : " + intValue);
    }
}
