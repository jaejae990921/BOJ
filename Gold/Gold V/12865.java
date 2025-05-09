import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] W = new int[N + 1];
        int[] V = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N + 1][K + 1];

        for (int j = 1; j <= N; j++) {
            for (int k = 1; k <= K; k++) {
                if (W[j] <= k) {
                    dp[j][k] = Math.max(dp[j - 1][k], dp[j - 1][k - W[j]] + V[j]);
                } else {
                    dp[j][k] = dp[j - 1][k];
                }
            }
        }

        sb.append(dp[N][K]);
        System.out.println(sb);
    }
}