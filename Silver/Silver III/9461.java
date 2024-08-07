import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] dp = new long[100];
        int N;

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i < 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        int T = Integer.parseInt(br.readLine());

        for (int j = 0; j < T; j++) {
            N = Integer.parseInt(br.readLine());
            sb.append(dp[N - 1]).append('\n');
        }

        System.out.println(sb);
    }
}