import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = A[i];
        }

        Arrays.sort(B);

        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++) {
                if (A[j] == B[k]) {
                    sb.append(k + " ");
                    B[k] = -1;
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}