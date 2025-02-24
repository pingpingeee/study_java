package java_pjt.chapter07_generic;

public class BoxExample2 {
    public static void main(String[] args) {
//        제네릭 타입파라미터 : String
//        Box2<String> box1 = new Box2<String>();
//        자바7부터 생략가능(다이아몬드 파라미터<>)
        Box2<String> box1 = new Box2<>();
        Box2<Integer> box2 = new Box2<>();

        box1.setT("hello");
//        컴파일 단계에서 제네릭 타입 감지
//        box1.setT(777);
        String str = box1.getT();
        System.out.println(str);

        box2.setT(777);
        int value = box2.getT(); // 오토 언박싱
        System.out.println(value);
    }
}
