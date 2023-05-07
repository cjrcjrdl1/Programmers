
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static long fact(long N) {
        if (N == 0) {
            return 1;
        }
        if (N == 1) {
            return 1;
        }
        return fact(N - 1) * N;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(fact(N));
    }

}
