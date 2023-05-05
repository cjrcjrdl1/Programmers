
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        while (K-- > 0) {
            int i = Integer.parseInt(br.readLine());
            if (i == 0) {
                stack.pop();
            } else {
                stack.push(i);
            }
        }

        while (stack.size() != 0) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }

}
