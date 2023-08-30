
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static Long[] seq = new Long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');
        }

        System.out.println(sb);

    }


    static long padovan(int n) {
        if (seq[n] == null) {
            seq[n] = padovan(n - 2) + padovan(n - 3);
        }
        return seq[n];
    }

}
