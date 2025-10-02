import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] nums = new int[3];
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        nums[0] = Integer.parseInt(st.nextToken());
        nums[1] = Integer.parseInt(st.nextToken());
        nums[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(nums);

        if ((nums[0] * nums[0] + nums[1] * nums[1]) == nums[2] * nums[2]) {
            sb.append("1");
        } else if (nums[0] == nums[1] && nums[1] == nums[2]) {
            sb.append("2");
        } else {
            sb.append("0");
        }
        
        System.out.println(sb);
    }
}
