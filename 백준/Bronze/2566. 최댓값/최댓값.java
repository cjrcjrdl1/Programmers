
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[10][10];
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int ri = 0;
        int rj = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max <arr[i][j]) {
                    max = arr[i][j];
                    ri = i;
                    rj = j;
                }
            }
        }

        ri = ri + 1;
        rj = rj + 1;
        System.out.println(max);
        System.out.println(ri + " " + rj);
    }


}
