
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] seq = new int[n];
        int[] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = seq[0];
        int max = seq[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + seq[i], seq[i]);

            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

}
