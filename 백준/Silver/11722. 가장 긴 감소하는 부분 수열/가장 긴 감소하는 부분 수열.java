
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] seq;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        seq = new int[n + 1];
        dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            //시작 1
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (seq[j] > seq[i]) { //이전 값이 더 크다면
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }

        System.out.println(result);

    }

}
