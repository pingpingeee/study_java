package java_pjt.question04;

public class IrregularArray {
    public static void main(String[] args) {
//        int[][] numArr = {{10, 11, 12}
//                , {20, 21}
//                , {30, 31, 32}
//                , {40, 41}};
//        for (int i = 0; i < numArr.length; i++) {
//            for (int j = 0; j < numArr[i].length; j++) {
//                System.out.print(numArr[i][j] + " ");
//            }
//            System.out.println();
//        }
        int[][] numArr = new int[4][];
        numArr[0] = new int[3];
        numArr[1] = new int[2];
        numArr[2] = new int[3];
        numArr[3] = new int[2];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                numArr[i][j] = (i + 1) * 10 + j;
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
