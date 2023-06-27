
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    static int n,m;
    static int[][] map;
    static boolean visited[];
    static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = map[y][x] = 1;
        }

        count = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == false) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);

    }

    public static void dfs(int start) {

        if (visited[start] == true) {
            return;
        }

        visited[start] = true;
        for (int i = 1; i <= n; i++) {
            if (map[start][i] == 1) {
                dfs(i);
            }
        }
    }




}