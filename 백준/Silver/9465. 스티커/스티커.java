
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int[][] arr = new int[2][n + 1]; //n+1 초기화 이유는 이후 나올 n-2때 0을 참조하게 하여 배열 범위를 초과시키지 않게하기 위함
            int[][] dp = new int[2][n + 1];
            for (int j = 0; j < 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            //첫번째 column은 원본값이 최댓갑이므로 원본값으로 초기화
            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            for (int j = 2; j <= n; j++) { //대각선 왼쪽 아래 혹은 대각선 왼쪽의 왼쪽 아래만 확인해주면 됨
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + arr[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + arr[1][j];
            }
            
            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }

}
