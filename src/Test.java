import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 플레이어 수 정의(입력)
        int playerCount = Integer.parseInt(st.nextToken());

        // 플레이어 이름들어가는 곳
        String[] playerName = new String[playerCount];

        // 플레이어 이름 입력
        for (int i = 0; i < playerName.length; i++) {
            playerName[i] = br.readLine();
        }
        int max[] = new int[playerCount];
        String[] test = new String[playerCount];

        for (int i = 0; i < playerName.length; i++) {
            if (test[i].charAt(0) != playerName[i].charAt(0)) {
                test[i] = String.valueOf(playerName[i].charAt(0));
            } else {
                max[i] += 1;
            }
        }

    }
}
