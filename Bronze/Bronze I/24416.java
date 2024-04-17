import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int recurCnt = 0, dpCnt = 0;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];

        recur(n);
        dp(n);

        sb.append(recurCnt).append(" ").append(dpCnt);
        System.out.println(sb);
    }

    public static int recur(int n) {
        if (n == 1 || n == 2) {
            recurCnt++;
            return 1;
        }
        return recur(n - 1) + recur(n - 2);
    }

    public static int dp(int n) {
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dpCnt++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}