import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] dp = new long[82];
        long sum = 0;

        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= 81; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int N = Integer.parseInt(br.readLine());
        sum = dp[N] * 2 + dp[N + 1] * 2;

        sb.append(sum);
        System.out.println(sb);
    }
}