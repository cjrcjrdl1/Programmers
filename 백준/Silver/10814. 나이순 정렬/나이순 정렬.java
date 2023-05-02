
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] list = new String[N][2];
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list[i][0] = st.nextToken();
            list[i][1] = st.nextToken();
        }

        Arrays.sort(list, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
            } else {
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(list[i][0] + " " + list[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
