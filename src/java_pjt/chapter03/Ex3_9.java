package java_pjt.chapter03;

public class Ex3_9 {
    public static void main(String[] args) {
        int[][] gugudan = new int[10][10];

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                gugudan[i][j] = i * j;
            }
        }
        System.out.println("2 x 7 = " + gugudan[2][7]);
        System.out.println("9 x 4 = " + gugudan[9][4]);
    }
}
