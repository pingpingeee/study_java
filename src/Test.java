import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int x[] = new int[num1];
        int y[] = new int[num1];
        int color[] = new int[num1];

        int xyResult[] = new int[num1];

        for (int i = 0; i < num1; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            color[i] = sc.nextInt();
        }

        int squareMax = 0, squareMin = 0;
        for (int i = 0; i < num1; i++) {
            xyResult[i] = x[i] + y[i];
            if (squareMax >= xyResult[i]) squareMax = xyResult[i];
            if (squareMin <= xyResult[i]) squareMin = xyResult[i];


        }
        System.out.println(Math.abs((squareMax - squareMin)) + 1);


    }
}
