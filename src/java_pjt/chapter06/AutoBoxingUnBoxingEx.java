package java_pjt.chapter06;

public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        int n = 10;
//        n을 값으로 가지는 개체 생성
        Integer integer1 = Integer.valueOf(n); // boxing
        Integer integer2 = n; // auto boxing
        System.out.println("integer1 : " + integer1);
        System.out.println("integer2 : " + integer2);

//        int m = integer1.intValue() + integer1.intValue(); // boxing
        int m = integer1 + integer1; // auto boxing
        System.out.println("m : " + m);

    }
}
