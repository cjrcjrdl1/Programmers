
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        IntSummaryStatistics st = list.stream().mapToInt(i -> i).summaryStatistics();
        Collections.sort(list);
        int average = (int) st.getAverage();
        Integer mid = list.get(2);
        System.out.println(average);
        System.out.println(mid);
    }
}
