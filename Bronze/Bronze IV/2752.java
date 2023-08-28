import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] nums = new int[3];
		String[] str = br.readLine().split(" ");

		for (int i = 0; i < 3; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(nums);

		for (int j = 0; j < 3; j++) {
			bw.write(nums[j] + " ");
		}
		bw.flush();
		bw.close();
	}
}