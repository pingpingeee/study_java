package java_pjt.question05;

public class IrregularArray2 {
    public static void main(String[] args) {
//        int[][] numArr = {{35, 36, 37, 38, 39}
//                , {45}
//                , {55, 56, 57, 58}
//                , {65, 66}
//                , {75, 76, 77}
//        };
        int[][] numArr = new int[5][];
        numArr[0] = new int[5];
        numArr[1] = new int[1];
        numArr[2] = new int[4];
        numArr[3] = new int[3];
        numArr[4] = new int[4];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
//                System.out.print(numArr[i][j] + " ");
//                numArr[i][j] = ((i + 1) * 10) + 20 + j + 5;
                numArr[i][j] = (i + 3) * 10 + 5 + j;
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
