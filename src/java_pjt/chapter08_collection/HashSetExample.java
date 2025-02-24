package java_pjt.chapter08_collection;

import java.util.*;

class AA {

}

public class HashSetExample {
    public static void main(String[] args) {
//    Set 인터페이스 컬렉션 타입으로 HashSet 클래스 객체 생성
        Set<String> set = new HashSet<>();
//        Set<AA> set = new HashSet<>();
//        Set<Object> set = new HashSet<>();
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet /JSP");
        set.add("Java"); // set 컬렉션 중복 객체 추가 불가
        AA aa = new AA();
//        set.add(aa);
        set.add("iBatis");

        int size = set.size();
        System.out.println("총 list 갯수 : " + size);

//         인터페이스는 객체 생성이 안되기에 메소드로 객체생성
//        set 컬렉션의 iterator 메소드를 호출해서 Iterator 인터페이스 타입으로 값을 받음
        Iterator<String> iterator1 = set.iterator();

        while (iterator1.hasNext()) {
            String element = (String) iterator1.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        System.out.println("총 객체 수 : " + set.size());
        Iterator<String> iterator2 = set.iterator();
        for (String element : set) {
            System.out.println("\t" + element);
        }

        if (set.isEmpty()) {
            System.out.println("객체 없음");
        } else {
            System.out.println("객체 있음");
        }
        set.clear();
        if (set.isEmpty()) {
            System.out.println("객체 없음");
        } else {
            System.out.println("객체 있음");
        }

    }
}
