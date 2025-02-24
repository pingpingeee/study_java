import java.util.*;

public class Test {
    public static void printList1(List<Object> list) {
        // List<Object>는 List<String>, List<Integer> 등을 받을 수 없음
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void printList2(List<?> list) {
        // List<?>는 모든 타입의 리스트를 받을 수 있음
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("A", "B", "C");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Object> intList1 = Arrays.asList(1, 2, 3);

        Set<Object> set = new HashSet<>();
        List<Object> list = new ArrayList<>();
        list.add("String123");
        System.out.println("asdf :" +list.get(0));

        printList1(intList1); // ❌ 컴파일 에러 (List<String>을 List<Object>에 전달 불가)

        printList2(strList);   // ✅ 가능
        printList2(intList);   // ✅ 가능
    }
}
