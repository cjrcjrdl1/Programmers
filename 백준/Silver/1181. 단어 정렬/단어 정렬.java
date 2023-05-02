
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] list = new String[N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
        }

        Arrays.sort(list, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            } else {
                return e1.length()-e2.length();
            }
        });

        sb.append(list[0]).append("\n");

        for (int i = 1; i < N; i++) {
            if (!list[i].equals(list[i - 1])) {
                sb.append(list[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
