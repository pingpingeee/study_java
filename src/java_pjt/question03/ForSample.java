package java_pjt.question03;

public class ForSample {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
            result += i;
        }
        System.out.println(result);
    }
}
