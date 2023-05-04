
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            boolean check = true;
            if (str.equals("0")) {
                break;
            }

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    check = false;
                }
            }

            if (check) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
