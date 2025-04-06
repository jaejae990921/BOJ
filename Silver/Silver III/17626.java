import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int min = 0, temp = 0;

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            min = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                temp = i - j * j;
                min = Math.min(min, dp[temp]);
            }

            dp[i] = min + 1;
        }

        sb.append(dp[N]);
        System.out.println(sb);
    }
}