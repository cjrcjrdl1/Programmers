
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        String a = sc.nextLine();
        String[] str = a.split("-");
        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    private static int mySum(String a) {
        int sum = 0;
        String[] temp = a.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }


}
