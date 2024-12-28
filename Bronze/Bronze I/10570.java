import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] nums = new int[1001];
        int N, num, max = 0;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            nums = new int[1001];
            max = 0;

            for (int j = 0; j < N; j++) {
                num = Integer.parseInt(br.readLine());
                nums[num]++;
            }

            for (int k = 0; k < 1001; k++) {
                if (nums[k] > max) {
                    max = nums[k];
                }
            }

            for (int l = 0; l < 1001; l++) {
                if (nums[l] == max) {
                    sb.append(l).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}