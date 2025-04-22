import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int i, j, sum;

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] prefixSum = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int a = 0; a < N; a++) {
            nums[a] = Integer.parseInt(st.nextToken());
        }

        for (int b = 0; b < N; b++) {
            prefixSum[b + 1] = prefixSum[b] + nums[b];
        }

        int M = Integer.parseInt(br.readLine());

        for (int c = 0; c < M; c++) {
            st = new StringTokenizer(br.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            sum = prefixSum[j] - prefixSum[i - 1];
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}