import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] nums = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        nums[2] = nums[2] - nums[0];
        nums[3] = nums[3] - nums[1];

        bw.write(fm(nums) + "\n");
        bw.flush();
        bw.close();
    }

    public static int fm(int[] nums) {
        int min = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if (min > nums[j]) {
                min = nums[j];
            }
        }
        return min;
    }
}