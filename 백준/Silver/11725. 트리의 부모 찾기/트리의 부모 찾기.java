
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            tree.get(x).add(y);
            tree.get(y).add(x);
        }

        boolean[] visited = new boolean[n+1];
        int[] parentNode = new int[n+1]; //부모 노드 저장 배열

        //BFS
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int node : tree.get(v)) {
                if (!visited[node]) {
                    visited[node] = true;
                    q.add(node);
                    parentNode[node]= v;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(parentNode[i]);
        }

    }

}
