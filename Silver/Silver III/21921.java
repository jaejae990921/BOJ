import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int max = 0, cnt = 0, sum = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] prefixSum = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        for (int j = 0; j <= N - X; j++) {
            sum = prefixSum[j + X] - prefixSum[j];

            if (sum > max) {
                max = sum;
            }
        }

        for (int k = 0; k <= N - X; k++) {
            sum = prefixSum[k + X] - prefixSum[k];

            if (sum == max) {
                cnt++;
            }
        }

        if (max == 0) {
            sb.append("SAD");
        } else {
            sb.append(max).append("\n").append(cnt);
        }

        System.out.println(sb);
    }
}