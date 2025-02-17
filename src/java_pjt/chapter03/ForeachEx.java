package java_pjt.chapter03;

public class ForeachEx {
    //    열거형 => inner class(내부클래스) 형태
    enum Week {월, 화, 수, 목, 금, 토, 일}

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        String[] names = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        int sum = 0;

        for (int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합 : " + sum);

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (Week day : Week.values()) {
//            열거형 값을 String 타입으로 받을 수 없음
//            String str = day;
            Week str = day;
            System.out.print(str + "요일 ");
        }
        System.out.println();
    }
}
