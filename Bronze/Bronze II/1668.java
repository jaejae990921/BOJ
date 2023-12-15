import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int left = nums[0];
        int right = nums[N - 1];

        int leftCnt = 1;
        int rightCnt = 1;

        for (int i = 1; i < N; i++) {
            if (left < nums[i]) {
                left = nums[i];
                leftCnt++;
            }
        }

        for (int i = N - 2; i >= 0; i--) {
            if (right < nums[i]) {
                right = nums[i];
                rightCnt++;
            }
        }

        System.out.println(leftCnt + "\n" + rightCnt);
	}
}