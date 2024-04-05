import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i, j;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] prefixSum = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int k = 0; k < N; k++) {
            arr[k] = Integer.parseInt(st.nextToken());
            prefixSum[k + 1] = prefixSum[k] + arr[k];
        }

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            sb.append(prefixSum[j] - prefixSum[i - 1]).append("\n");
        }

        System.out.println(sb);
    }
}