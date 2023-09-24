
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int sum = 0;

        for (int i = n.length()-1; i >= 0; i--) {
            char c = n.charAt(i);

            if ('A' <= c && c <= 'Z') {
                sum += (c - 'A' + 10) * tmp;
            } else {
                sum += (c - '0') * tmp;
            }
            tmp *= b;
        }

        System.out.println(sum);
    }

}
