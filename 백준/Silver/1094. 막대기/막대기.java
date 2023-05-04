
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int count = 0;
        int stick = 64;

        while (X > 0) {
            if (stick > X) {
                stick /= 2;
            } else {
                count++;
                X -= stick;
            }
        }

        System.out.println(count);

    }
}
