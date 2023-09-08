
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char[] str1;
    static char[] str2;

    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();

        dp = new Integer[str1.length][str2.length];

        System.out.println(LCS(str1.length - 1, str2.length - 1));
    }

    static int LCS(int x, int y) {
        if (x == -1 || y == -1) { //인덱스 범위 초과시 0
            return 0;
        }

        if (dp[x][y] == null) {
            dp[x][y] = 0;

            if (str1[x] == str2[y]) { //두 문자가 같으면 대각선 왼쪽위의 숫자에 + 1
                dp[x][y] = LCS(x - 1, y - 1) + 1;
            } else { //같지 않다면 왼쪽값이랑 위쪽값 중 큰 값으로 초기화
                dp[x][y] = Math.max(LCS(x - 1, y), LCS(x, y - 1));
            }
        }

        return dp[x][y];
    }
}
