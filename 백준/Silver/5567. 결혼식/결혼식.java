
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); //양방향 인접그래프를 ArrayList로 구현
    static int n,m, count;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[n + 1];
        count = 0;

        StringTokenizer st;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        visited[1] = true;
        dfs(1,0);

        for (int i = 2; i < visited.length; i++) { //i=1일때는 상근이 본인이라 제외
            if (visited[i]) count++;
        }
        System.out.println(count);
    }

    static void dfs(int start, int depth) {
        if (depth == 2) { //상근이 친구와 친구의 친구까지의 범위 -> 트리 0,1(친구),2(친구의 친구)
            return;
        }

        for (int i : graph.get(start)) {
            visited[i] = true;
            dfs(i,depth+1);
        }
    }
}
