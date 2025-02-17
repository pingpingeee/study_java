package java_pjt.chapter03;

// 문자열에서 알파벳 갯수 구하기
// 알파벳 대 소문자 상관없음
// toCharArray() 메소드 이용
public class Ex3_8 {
    public static void main(String[] args) {
        int count = 0;
        String str = "Programming is fun. Right?";

//        toCharArray() => 문자열에서 문자 하나씩 가지고 옴
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'r' || charArr[i] == 'R') {
                count++;
            }
        }
        System.out.println("r || R의 갯수 : " + count);
    }
}
