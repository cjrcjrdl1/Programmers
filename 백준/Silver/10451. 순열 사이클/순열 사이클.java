
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            visited = new boolean[n + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int j = 1; j < n + 1; j++) {
                if (!visited[j]) {
                    dfs(j);
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int start) {
        visited[start] = true;
        int next = arr[start];

        if (!visited[next]) {
            dfs(next);
        }
    }
}
