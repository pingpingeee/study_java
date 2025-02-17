package java_pjt.chapter03;

public class Ex3_4 {
    public static void main(String[] args) {
//        배열 선언, 생성, 초기화
//        String[] names = {"Sam", "Kate", "John", "Jenny"};

//        [Ljava.lang.String;@10f87f48 => 참고변수의 값
//        System.out.println(names);

//        String 배열 '객체' 생성
//        String[] names = new String[4];
//        names[0] = "aaa"; // 값 할당
//        int 기본값 : 0
        int[] names = new int[4];

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
