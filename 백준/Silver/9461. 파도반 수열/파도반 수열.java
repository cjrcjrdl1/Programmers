
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] dp = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        padovan();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append('\n');
        }

        System.out.println(sb);
    }

    static void padovan() {
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i < 101; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

    }
}
