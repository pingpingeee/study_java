package java_pjt.chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("입력데이터 : " + list);
        List<Integer> result = list.stream() // 스트림 생성
//                filter 메소드로 짝수만 추출(2, 4, 6, 8)
                .filter(n -> {
                    return n % 2 == 0;
                })
//                map 메소드로 제곱
                .map(n -> {
                    return n * n;
                })
                .collect(Collectors.toList());
        System.out.println("실행 결과 : " + result); // 4, 16, 36, 64x
    }
}
