package java_pjt.chapter08_collection;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
//        ArrayList 클래스 타입으로 ArrayList 클래스로 객체 생성
        ArrayList<String> arrayList = new ArrayList<>();
        boolean aaa = arrayList.add("oracle");
        System.out.println(aaa);
        boolean bbb = arrayList.add("mysql");
        System.out.println(bbb);
        boolean ccc = arrayList.add("oracle"); // 중복된 객체를 추가해도 문제 없음
        System.out.println(ccc);

        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            System.out.println(i + " : " + str);
        }

    }
}
