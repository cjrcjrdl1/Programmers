
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            if (max < A[i]) {
                max = A[i];
            }
            sum += A[i];
        }
        System.out.println(sum*100.0/max/N);
    }
}
