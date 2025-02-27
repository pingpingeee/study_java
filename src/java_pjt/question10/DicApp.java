package java_pjt.question10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> str = new HashMap<>();
        str.put("사랑", "love");
        str.put("아기", "baby");
        str.put("돈", "money");
        str.put("미래", "future");
        str.put("희망", "hope");

        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.print("한글 단어 ? ");
            String s = sc.next();
            if (s.equals("그만")) break;
            String v = str.get(s);
            if (v != null) {
                System.out.println(s + "은(는) " + v);
            } else {
                System.out.println(s + "는 저의 사전에 없습니다.");
            }
        }
    }
}
