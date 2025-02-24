package java_pjt.question07;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");

//        System.out.println(st.countTokens()); // 나눈 토큰 값
//        System.out.println(st.nextToken()); // 토큰값 가져오기
//        st.hasMoreTokens() => 토큰이 있으면 참

        int count = st.countTokens();
        for (int i = 0; i < count; i++) {
            System.out.println("count : " + count);
            System.out.println(st.nextToken());
        }
    }
}
