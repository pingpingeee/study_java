package java_pjt.question03;

public class DoWhileTest {
    public static void main(String[] args) {
        int num = 0;
        int result = 0;


        do {
            num +=1;
            if (num % 2 == 0) {
                result += num;
            }
        } while (num < 99);

        System.out.println(result);
    }
}
