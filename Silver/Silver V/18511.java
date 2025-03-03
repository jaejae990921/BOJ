import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, K, answer;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        nums = new int[K];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < K; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        dfs(0);

        sb.append(answer);
        System.out.println(sb);
    }

    public static void dfs(int num) {
        if (num > N)
            return;
        if (answer < num)
            answer = num;

        for (int i = K - 1; i >= 0; i--) {
            dfs(num * 10 + nums[i]);
        }
    }

}