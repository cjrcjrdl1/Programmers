
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] dp = new Integer[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(logic(n)).append('\n');
        }

        System.out.println(sb);
    }

    public static int logic(int n) {
        if (dp[n] == null) {
            dp[n] = logic(n - 3) + logic(n - 2) + logic(n - 1);
        }

        return dp[n];
    }

}
