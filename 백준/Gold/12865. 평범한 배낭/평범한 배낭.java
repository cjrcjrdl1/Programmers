
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static Integer[][] dp;
    static int[] w;
    static int[] v;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //물품 수
        int k = Integer.parseInt(st.nextToken()); //버틸수 있는 무게

        w = new int[n]; //무게
        v = new int[n]; //가치

        dp = new Integer[n][k + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapsack(n - 1, k));
    }

    static int knapsack(int i, int k) {
        if (i < 0) {
            return 0;
        }

        if (dp[i][k] == null) {
            if (w[i] > k) { //현재 물건(i)을 추가로 못담는다면
                dp[i][k] = knapsack(i - 1, k); //이전 i값 탐색
            } else { //이전 i값과 이전 i값에 대한 k-w[i]의 값 + 현재 가치(v[i]) 중 큰 값을 저장
                dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - w[i]) + v[i]);
            }
        }
        return dp[i][k];
    }

}
