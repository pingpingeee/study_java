package java_pjt.chapter03;

public class Ex3_5 {
    public static void main(String[] args) {
        int[] sales = new int[5];
        sales[0] = 52;
        sales[1] = 50;
        sales[2] = 55;
        sales[3] = 42;
        sales[4] = 38;

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        System.out.println(sum);
    }
}
