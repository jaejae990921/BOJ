import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N, M;

        int T = Integer.parseInt(br.readLine());

        int[][] dp = new int[31][31];

        for (int i = 1; i < 31; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for (int j = 2; j < 31; j++) {
            for (int k = 1; k < j; k++) {
                dp[j][k] = dp[j - 1][k - 1] + dp[j - 1][k];
            }
        }

        for (int l = 0; l < T; l++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            sb.append(dp[M][N]).append('\n');
        }

        System.out.println(sb);
    }
}