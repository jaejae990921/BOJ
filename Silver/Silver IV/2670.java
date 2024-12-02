import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N + 1];
        double[] dp = new double[N + 1];

        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
            dp[i] = Math.max(arr[i], dp[i - 1] * arr[i]);
        }

        double max = dp[1];

        for (int i = 2; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }

        sb.append(String.format("%.3f", max));
        System.out.println(sb);
    }
}