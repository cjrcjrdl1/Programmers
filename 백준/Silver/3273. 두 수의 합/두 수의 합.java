
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int x = Integer.parseInt(br.readLine());

        int count = 0;
        int start = 0;
        int end = N - 1;
        int sum = 0;

        while (start < end) {
            sum = A[start] + A[end];
            if (sum == x) {
                count++;
            }
            if (sum <= x) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(count);
    }
}
