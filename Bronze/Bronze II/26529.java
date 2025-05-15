import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[46];
        int num = 0;

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= 45; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            sb.append(dp[num]).append("\n");
        }

        System.out.print(sb);
    }
}