package java_pjt.chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", "Library");
        System.out.println("입력데이터 : " + list);

        List<Integer> result = list.stream() // 스트림 생성
                .map(String::length) // 메소드 참조로 문자열 길이 구함
                .collect(Collectors.toList());
        System.out.println("실행 결과 : " + result); // 실행 결과 : [4, 6, 7]
    }
}
