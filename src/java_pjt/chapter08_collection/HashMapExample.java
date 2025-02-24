package java_pjt.chapter08_collection;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동1", 123);
        map.put("홍길동2", 35);
        map.put("홍길동3", 12);
        map.put("홍길동1", 123);
//        map.put("홍길동1", 30); // 키 중복은 안됨

        System.out.println("총 Entry 수 : " + map.size());
        System.out.println("홍길동 : " + map.get("홍길동1")); // 키에 해당하는 값 출력
        System.out.println();

        Set<String> keySet = map.keySet(); // map 컬렉션의 모든 키들을 Set 컬렉션으로 받음
        Iterator<String> keyIterator = keySet.iterator();

//        Map 컬렉션 키/값을 가져오는 첫 번째 방식
        while (keyIterator.hasNext()) {
            String key = (String) keyIterator.next(); // 컬렉션 객체를 가져옴
            Integer value = map.get(key); // 메소드로 Map 컬렉션의 키를 가지고 값을 가져옴
//            출력 순서는 랜덤으로 발생됨
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        map.remove("홍길동1");
        System.out.println("총 Entry 수 : " + map.size());

//        Map.Entry 구조로 키/값 으로 객체를 받음
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        Set 컬렉션 방식으로 객체 처리(키, 값을 가져옴)
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

//        Map 컬렉션 키/값을 가져오는 두 번째 방식
        while (entryIterator.hasNext()) { // 컬렉션 객체가 있으면 참
            Map.Entry<String, Integer> entry = entryIterator.next(); // 컬렉션 객체를 가져옴
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
