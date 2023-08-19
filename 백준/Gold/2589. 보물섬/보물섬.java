import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m;
    static char[][] arr;
    static boolean[][] visited;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n+1][m+1];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    visited = new boolean[n][m];
                    int len = bfs(i, j);
                    max = Math.max(len, max);
                }
            }
        }
        System.out.println(max);

    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new int[]{x, y, 0});

        int len = 0;
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];
            int cost = now[2];

            for (int i = 0; i < 4; i++) {
                int nx = nowX + dx[i];
                int ny = nowY + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]
                        && arr[nx][ny] == 'L') {
                    q.add(new int[]{nx, ny, cost+1});
                    visited[nx][ny] = true;
                    len = Math.max(len, cost + 1);
                }
            }
        }
        return len;
    }
}
