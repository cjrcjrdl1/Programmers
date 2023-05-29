
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int A[] = new int[N+1];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (i <= N && j <= N) {
            if (sum >= S && min > j - i) {
                min = j - i;
            }

            if (sum < S) {
                sum += A[j++];
            } else {
                sum -= A[i++];
            }
        }

        System.out.println((min == Integer.MAX_VALUE) ? 0 : min);
    }
}
