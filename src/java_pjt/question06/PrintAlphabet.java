package java_pjt.question06;

import java.util.Scanner;

public class PrintAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나 입력 : ");
        char str = sc.next().charAt(0);

//        int count = 0;
//        for (int i = 'a'; i <= str; i++) {
//            for (int j = str; j >= i; j--) {
//                System.out.print((char) ('a' + count));
//                count += 1;
//            }
//            count = 0;
//            System.out.println();
//        }

        for (char i = str; i >= 'a'; i--) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
