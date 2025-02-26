package java_pjt.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tomas");
        list.add("Edward");
        list.add("Jack");

        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.print(s + " "));
        System.out.println("\n------------------");

//        정렬하는 기능(오름차순) => sorted()
        list.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println("\n------------------");

//        데이트를 변형 할 때 사용하는 map => 길이로 변경
        list.stream().map(s -> s.length()).forEach(s -> System.out.print(s + " "));
        System.out.println("\n------------------");

//        이름의 길이가 5글자 이상인 경우
        list.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s + " "));
    }
}
