
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int real = n / 4;

        for (int i = 0; i < real-1; i++) {
            System.out.print("long ");
        }
        System.out.print("long int");

    }
}
