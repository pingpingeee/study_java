package java_pjt.chapter03;

// 4년 전체 평점의 평균 구하기
// 2차원 배열 비용해서 원소로 초기화
// 1행 1열부터 4행 2열까지
public class Ex3_10 {
    public static void main(String[] args) {
        double sum = 0;
        double[][] numArr = {{3.3, 3.4} // 1행 1열, 2열 => 1학년 1학기/2학기
                , {3.5, 3.6} // 2행 1열, 2열 => 2학년 1학기/2학기
                , {3.7, 4.0} // 3행 1열, 2열 => 3학년 1학기/2학기
                , {4.1, 4.2} // 4행 1열, 2열 => 4학년 1학기/2학기
        };

        for (int i = 0; i < numArr.length; i++) {
//            numArr[i].length => 2열의 크기
            for (int j = 0; j < numArr[i].length; j++) {
                sum += numArr[i][j];
            }
        }
        int n = numArr.length;
        System.out.println(n);
        int m = numArr[0].length;
        System.out.println(m);
        System.out.println(sum / (n * m));
    }
}
