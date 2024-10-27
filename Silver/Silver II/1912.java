import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer, temp;

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        dp[0] = Integer.parseInt(st.nextToken());
        answer = dp[0];

        for (int i = 1; i < n; i++) {
            temp = Integer.parseInt(st.nextToken());

            dp[i] = Math.max(dp[i - 1] + temp, temp);
            answer = Math.max(answer, dp[i]);
        }

        sb.append(answer);
        System.out.println(sb);
    }
}