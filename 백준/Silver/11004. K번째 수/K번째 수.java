
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(A, 0, N - 1, K - 1);
        System.out.println(A[K - 1]);
    }

    public static void quickSort(int[] A, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(A, S, E);
            if (pivot == K) {
                return;
            } else if (K < pivot) {
                quickSort(A, S, pivot - 1, K);
            } else {
                quickSort(A, pivot + 1, E, K);
            }
        }
    }

    private static int partition(int[] A, int S, int E) {
        if (S + 1 == E) {
            if (A[S] > A[E]) {
                swap(A, S, E);
                return E;
            }
        }
        int M = (S + E) / 2;
        swap(A, S, M);  //중앙 값을 1번째 요소로 이동하기
        int pivot = A[S];
        int i = S + 1, j = E;
        while (i <= j) {
            while (j >= S + 1 && pivot < A[j]) { //피벗보다 작은 수가 나올때까지 j--
                j--;
            }
            while (i <= E && pivot > A[i]) { //피벗보다 큰 수가 나올때까지 i++
                i++;
            }
            if (i <= j) {
                swap(A,i++,j--);
            }
        }

        A[S] = A[j];
        A[j] = pivot;
        return j;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
