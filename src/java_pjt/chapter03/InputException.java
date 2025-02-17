package java_pjt.chapter03;

import java.util.Scanner;

/*정수 3개 입력 받음
정수가 아닌 경우 패스
3개의 합 출력
예외처리 이용*/
public class InputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = 0;

        System.out.print("정수 3개 입력 : ");
        for (int i = 0; i < 3; i++) {
            try {
                n = sc.nextInt();
            } catch (Exception e) {
                System.out.println("정수가 아님 다시 입력");
                sc.next(); // 정수가 아닌 것 패스
                i--; // 다시 입력받기 위해 카운트 감소
                continue; // 합계 누적 방지
            }
            sum += n;
        }
        System.out.println("합계 : " + sum);
    }
}
