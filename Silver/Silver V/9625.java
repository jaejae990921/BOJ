import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[46];
        dp[0] = 0;
        dp[1] = 1;

        int K = Integer.parseInt(br.readLine());

        for (int i = 2; i <= 45; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        sb.append(dp[K - 1] + " " + dp[K]);
        System.out.println(sb);
    }
}