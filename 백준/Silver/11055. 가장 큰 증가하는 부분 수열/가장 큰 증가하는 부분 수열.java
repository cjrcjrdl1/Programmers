
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n + 1];
        int[] dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = seq[1];
        for (int i = 1; i <= n; i++) {
            dp[i] = seq[i];
            for (int j = 1; j < i; j++) {
                if (seq[j] < seq[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + seq[i]);
                }
            }
        }

        int result = 0;
        for (int i : dp) {
            result = Math.max(result, i);
        }

        System.out.println(result);
    }

}
