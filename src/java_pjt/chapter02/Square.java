package java_pjt.chapter02;

public class Square {
    public static void main(String[] args) {
        int n = 4;
        int result = square(n);

        System.out.println(result);
    }

    public static int square(int num) {
        int result = num * num;
        return result;
    }
}
