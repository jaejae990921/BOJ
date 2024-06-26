import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 0;
        dp[3] = 1;

        for (int i = 4; i < 1001; i++) {
            if ((dp[i - 1] & dp[i - 3]) == 1) {
                dp[i] = 0;
            } else {
                dp[i] = 1;
            }
        }

        sb.append(dp[N] == 1 ? "SK" : "CY");
        System.out.println(sb);
    }
}