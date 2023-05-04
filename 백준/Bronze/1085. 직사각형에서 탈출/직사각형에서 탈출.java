
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int xx = Math.min(x, w - x);
        int yy = Math.min(y, h - y);

        System.out.println(Math.min(xx, yy));

    }
}
