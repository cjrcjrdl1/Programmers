
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int n,m,count;
    static boolean visited[];
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        visited[1] = true;
        dfs(1, 0);

        for (int i = 2; i < visited.length; i++) {
            if (visited[i] == true) {
                count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int start, int depth) {
        if (depth == 2) {
            return;
        }

        for (Integer x : graph.get(start)) {
            visited[x] = true;
            dfs(x, depth + 1);
        }
    }
}
