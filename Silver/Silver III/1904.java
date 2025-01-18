import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] dp = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = -1;
        }

        sb.append(makeTile(N));
        System.out.println(sb);
    }

    public static int makeTile(int N) {
        if (dp[N] == -1) {
            dp[N] = (makeTile(N - 1) + makeTile(N - 2)) % 15746;
        }

        return dp[N];
    }
}