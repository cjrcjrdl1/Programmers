
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            switch (n) {
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.pop()).append('\n');
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        sb.append(stack.peek()).append('\n');
                    } else {
                        sb.append(-1).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
