package java_pjt.chapter02;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
//        작은 타입을 큰 타입으로 받음 : 자동변환
        int intValue = byteValue;

        System.out.println("intValue : " + intValue);

        char charValue = '가';
//        변수에 유니코드가 저장
        intValue = charValue;
        System.out.println("intValue : " + intValue);

        intValue = 50;
//        작은 타입을 큰 타입으로 받음 : 자동변환
        long longValue = intValue;
        System.out.println("longValue : " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue : " + doubleValue);
    }
}
