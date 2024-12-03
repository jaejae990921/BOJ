import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] nums, dp;
        int N, max;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            nums = new int[N + 1];
            dp = new int[N + 1];
            max = Integer.MIN_VALUE;

            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            dp[1] = nums[1];

            for (int k = 2; k <= N; k++) {
                dp[k] = Math.max(dp[k - 1] + nums[k], nums[k]);
            }

            for (int l = 1; l <= N; l++) {
                max = Math.max(max, dp[l]);
            }

            sb.append(max).append("\n");
        }

        System.out.println(sb);
    }
}