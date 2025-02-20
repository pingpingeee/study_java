package java_pjt.question06;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        int numberToGuess = random.nextInt(10) + 1;
        int numberToGuess = new Random().nextInt(10) + 1;
        int guess;

        while (true) {
            System.out.print("추측한 숫자 입력 : ");
            guess = sc.nextInt();
            if (guess > numberToGuess) {
                System.out.println("추측한 숫자가 너무 큼");
            } else if (guess < numberToGuess) {
                System.out.println("추측한 숫자가 너무 작음");
            } else {
                System.out.println("정답");
                break;
            }
        }
    }
}
