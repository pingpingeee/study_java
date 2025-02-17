package java_pjt.question04;

public class Print2DArray {
    public static void main(String[] args) {
        int[][] numArr = {{1}
                , {1, 2, 3}
                , {1}
                , {1, 2, 3, 4}
                , {1, 2}
        };
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
