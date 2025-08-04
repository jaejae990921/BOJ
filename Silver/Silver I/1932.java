import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[][] dp = new int[501][501];
        int max = 0, value = 0;

        int n = Integer.parseInt(br.readLine());
        dp[0][0] = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j <= i; j++) {
                value = Integer.parseInt(st.nextToken());
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + value;
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + value;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + value;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }

        sb.append(max);
        System.out.println(sb);
    }
}