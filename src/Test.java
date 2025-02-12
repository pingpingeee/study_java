import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int leng = Integer.parseInt(st.nextToken());
        int[] numArr = new int[leng];

        System.out.println(numArr.length);

        numArr = new int[]{Integer.parseInt(st.nextToken())};


//        for (int i = 0; i <= numArr.length; i++) {
//            numArr[i] = Integer.parseInt(st.nextToken());
//        }
    }
}
