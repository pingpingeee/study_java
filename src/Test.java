import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 64) return;
        int[] numArr = new int[7];
        int rul = 64;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = rul;
            rul /= 2;
        }
        int count = 0;
        int result = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (x == numArr[i]) {
                count++;
                break;
            } else {
                if (x > numArr[i]) {
                    result += numArr[i];
                    if (result > x) result -= numArr[i];
                    else count++;
                    if (result == x) break;
                }
            }
        }
        System.out.println(count);
    }
}
