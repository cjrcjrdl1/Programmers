
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length() / 10;
        int index = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(s.substring(index, index + 10));
            index += 10;
        }
        int m = s.length() % 10;
        System.out.println(s.substring(index, index + m));
    }
}
