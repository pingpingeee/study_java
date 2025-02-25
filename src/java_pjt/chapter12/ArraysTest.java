package java_pjt.chapter12;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] array = {9, 4, 5, 6, 2, 1};
        printArray(array);
        System.out.println();
        Arrays.sort(array); // 오름차순 정렬
        printArray(array);
        System.out.println();

//        키를 탐색하고 인덱스 반환, 없으면 음수
        System.out.println(Arrays.binarySearch(array, 9));
        System.out.println(Arrays.binarySearch(array, -101));
        Arrays.fill(array, 8); // 배열을 특정한 값으로 채움
        printArray(array);
    }

    //    배열을 매개변수로 받아서 출력하는 메소드
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
