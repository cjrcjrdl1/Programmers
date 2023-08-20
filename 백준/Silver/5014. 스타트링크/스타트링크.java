
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int f,s,g,u, d;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        arr = new int[f+1];

        System.out.println(bfs());
    }

    static String bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        arr[s] = 1;

        while (!q.isEmpty()) {
            Integer now = q.poll();
            if (now == g) {
                return String.valueOf(arr[now] - 1);
            }

            if (now + u <= f) {
                if (arr[now + u] == 0) {
                    arr[now + u] = arr[now] + 1;
                    q.add(now + u);
                }
            }

            if (now - d > 0) {
                if (arr[now - d] == 0) {
                    arr[now - d] = arr[now] + 1;
                    q.add(now - d);
                }
            }
        }
        return "use the stairs";
    }


}
