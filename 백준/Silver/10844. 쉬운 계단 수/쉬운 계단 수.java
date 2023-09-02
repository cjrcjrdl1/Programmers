
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Long[][] dp;
    static int n;
    final static long mod = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new Long[n + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += recur(n, i);
        }
        System.out.println(result % mod);
    }

    static long recur(int digit, int val) {//digit는 자릿수, val은 자릿값
        if (digit == 1) {
            return dp[digit][val];
        }

        if (dp[digit][val] == null) {
            if (val == 0) {
                dp[digit][val] = recur(digit - 1, 1); //val이 0인 경우 이전자리는 1밖에 못옴
            } else if (val == 9) {
                dp[digit][val] = recur(digit - 1, 8); //val이 9인 경우 이전자리는 8밖에 없음
            } else {
                dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
            }
        }
        return dp[digit][val] % mod;
    }


}
