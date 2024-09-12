import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0, sum = 0, maxLen;

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        boolean[] flag = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 4) {
            for (int j = 0; j < N; j++) {
                sum += nums[j];
            }

            sb.append(sum);
            System.out.println(sb);
            return;
        } else {
            maxLen = N - 3;

            for (int k = 0; k < 4; k++) {
                sum = 1;
                for (int l = k; l < maxLen + k; l++) {
                    sum *= nums[l];
                    flag[l] = true;
                }

                for (int m = 0; m < N; m++) {
                    if (!flag[m]) {
                        sum += nums[m];
                    }
                }

                if (max < sum) {
                    max = sum;
                }

                for (int n = 0; n < N; n++) {
                    flag[n] = false;
                }
            }
        }

        sb.append(max);
        System.out.println(sb);
    }
}