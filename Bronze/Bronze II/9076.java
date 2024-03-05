import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] nums = new int[5];

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            if (nums[3] - nums[1] >= 4) {
                sb.append("KIN\n");
            } else {
                sb.append(nums[1] + nums[2] + nums[3] + "\n");
            }
        }

        System.out.println(sb);
    }
}