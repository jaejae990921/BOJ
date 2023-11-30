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
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());

            if (nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
                break;
            }

            Arrays.sort(nums);

            if(nums[2] >= nums[0] + nums[1]) {
				sb.append("Invalid\n");
			}else if(nums[0] == nums[1] && nums[1] == nums[2]) {
				sb.append("Equilateral\n");
			}else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
				sb.append("Isosceles\n");
			}else {
				sb.append("Scalene\n");
			}
        }

        System.out.println(sb);
	}
}