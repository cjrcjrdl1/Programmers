
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();
            for (int j = I - 1; j < J; j++) {
                list[j] = K;
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }

}
