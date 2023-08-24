
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static boolean visited[];
    static int parentNode[];
    static ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n + 1; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            tree.get(x).add(y);
            tree.get(y).add(x);
        }

        visited = new boolean[n + 1];
        parentNode = new int[n + 1];

        bfs(1);

        for (int i = 2; i < n + 1; i++) {
            System.out.println(parentNode[i]);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            Integer now = q.poll();
            for (Integer node : tree.get(now)) {
                if (!visited[node]) {
                    visited[node] = true;
                    q.add(node);
                    parentNode[node] = now;
                }
            }
        }
    }
}
