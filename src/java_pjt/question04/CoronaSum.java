package java_pjt.question04;

public class CoronaSum {
    public static void main(String[] args) {
        int[][] numArr = new int[12][3];
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[0].length; j++) {
                numArr[i][j] = (10 * (i + 1)) + (1 * (j + 1));
                sum += numArr[i][j];
            }
        }
        System.out.println("1년 전체 코로나 환자 수 : " + sum);
    }
}
