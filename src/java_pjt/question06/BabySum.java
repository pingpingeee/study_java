package java_pjt.question06;

public class BabySum {
    public static void main(String[] args) {
        int[][] numArr = new int[120][5];
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[0].length; j++) {
                numArr[i][j] = (100 * (i + 1)) + (j + 1);
                sum += numArr[i][j];
            }
        }
        System.out.println("10년간 5개 나라의 총 신생아 수 : " + sum + "명");
    }
}
