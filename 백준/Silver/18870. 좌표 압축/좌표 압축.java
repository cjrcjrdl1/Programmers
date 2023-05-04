
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int i : sorted) {
            if (!rankingMap.containsKey(i)) {
                rankingMap.put(i, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : origin) {
            int ranked = rankingMap.get(i);
            sb.append(ranked).append(" ");
        }

        System.out.println(sb);


    }
}
