package java_pjt.chapter03;

public class ContinueTest {
    public static void main(String[] args) {
        int count = 0;
        String s = "no news is good news";

        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'n') count++; // 방법 1
            if (s.charAt(i) != 'n') continue; // 방법 2
            count++;
        }
        System.out.println("문장에서 발견된 n의 갯수 : " + count);
    }
}
