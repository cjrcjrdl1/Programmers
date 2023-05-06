
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    Integer i = q.poll();
                    if (i == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(i).append("\n");
                    }
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    Integer peek = q.peek();
                    if (peek == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(peek).append("\n");
                    }
                    break;
                case "back":
                    Integer peekLast = q.peekLast();
                    if (peekLast == null) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(peekLast).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }

}
