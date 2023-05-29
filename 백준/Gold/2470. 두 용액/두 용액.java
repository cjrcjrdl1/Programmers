
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int i = 0;
        int j = A.length-1;

        int gap = Integer.MAX_VALUE;
        int answer1 = 0;
        int answer2 = 0;

        int sum;

        while (i < j) {
            sum = A[i] + A[j];
            int temp = Math.abs(sum);
            if (temp < gap) {
                gap = temp;
                answer1 = A[i];
                answer2 = A[j];
            }

            if (sum > 0) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println(answer1 + " " + answer2);

    }
}
