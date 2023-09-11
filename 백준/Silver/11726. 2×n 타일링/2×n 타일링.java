
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Long[] dp = new Long[1001];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp[1] = 1L;
        dp[2] = 2L;
        int n = Integer.parseInt(br.readLine());
        System.out.println(logic(n));

    }

    static long logic(int n) {
        if (dp[n] == null) {
            dp[n] = logic(n - 2) + logic(n-1);
        }
        return dp[n] % 10007;
    }


}
