package java_pjt.question06;

import java.util.Random;

/**
 * 난수 발생 Math, Random 두가지 클래스
 */
public class RandomNumber {
    public static void main(String[] args) {
        int rNumber;
        Random random = new Random();
//        random.nextInt(); // 난수발생(int타입)
//        random.nextInt(10); // 난수발생(0 ~ 9의 정수)
//        int a = random.nextInt(10) + 1; // 난수발생(1 ~ 10의 정수)

        while (true) {
            rNumber = random.nextInt(10) + 1;
            if (rNumber == 7) {
                System.out.println("rNumber : " + rNumber + " 종료");
                break;
            }
            System.out.println("rNumber : " + rNumber);
        }
    }
}
