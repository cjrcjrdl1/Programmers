
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] s = str.toCharArray();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += s[i] - '0';
        }

        System.out.println(sum);
    }
}
