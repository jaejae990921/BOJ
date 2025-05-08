import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] nums;
        int num = 0;

        int N = Integer.parseInt(br.readLine());
        nums = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());

            if (nums[num]) {
                sb.append(num);
                break;
            } else {
                nums[num] = true;
            }
        }

        System.out.print(sb);
    }
}