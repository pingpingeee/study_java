package java_pjt.chapter03;

public class Ex3_7 {
    public static void main(String[] args) {
        int[] evens = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int[] primes = {1, 3, 5, 7, 11, 13, 17, 19};

//        1. 짝수배열을 메소드 매개변수로 호출
        int evenSum = sum(evens);
        System.out.println("짝수 배열의 합 : " + evenSum);

        int primesSum = sum(primes);
        System.out.println("홀수 배열의 합 : " + primesSum);
    }

//    2. arr로 evens를 받음
    public static int sum(int[] arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
