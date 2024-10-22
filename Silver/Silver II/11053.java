import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num, max = 0;

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N + 1];
        int[] dp = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        nums[1] = Integer.parseInt(st.nextToken());
        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            num = Integer.parseInt(st.nextToken());
            nums[i] = num;
            dp[i] = 1;

            for (int j = 1; j < i; j++) {
                if (nums[j] < num && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        for (int k = 1; k <= N; k++) {
            max = Math.max(max, dp[k]);
        }

        sb.append(max);
        System.out.println(sb);
    }
}