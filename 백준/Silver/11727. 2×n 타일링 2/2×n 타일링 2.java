
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Long[] dp = new Long[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 3L;


        System.out.println(logic(n));
    }

    static long logic(int n) {
        if (dp[n] == null) {
            dp[n] = (logic(n - 2) * 2 + logic(n - 1)) % 10007;
        }

        return dp[n];
    }

}
