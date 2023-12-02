import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        long sum;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            sum = 0;
            String[] input = br.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int[] nums = new int[n];

            for (int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(input[j + 1]);
            }

            for (int k = 0; k < nums.length  -1 ; k++) {
                for (int l = k + 1; l < nums.length; l++) {
                    sum += gcd(nums[k], nums[l]);
                }
            }

            sb.append(sum + "\n");
        }

        System.out.println(sb);
	}

    public static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }

        return a;
    }
}