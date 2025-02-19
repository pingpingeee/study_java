package java_pjt.question06;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("양수 10개 입력");

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
            if (numArr[i] < min) min = numArr[i];
            if (numArr[i] > max) max = numArr[i];
        }
        System.out.println("가장 작은 수 : " + min);
        System.out.println("가장 큰 수 : " + max);
        System.out.println("최소값 + 최대값 : " + (min + max));
    }
}
