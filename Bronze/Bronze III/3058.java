import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int min = 100;
		int sum = 0;

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String[] nums = br.readLine().split(" ");
			
			for (int j = 0; j < 7; j++) {
				if (Integer.parseInt(nums[j]) % 2 == 0) {
					sum += Integer.parseInt(nums[j]);

					if (min > Integer.parseInt(nums[j])) {
						min = Integer.parseInt(nums[j]);
					}
				}
			}

			bw.write(sum + " " + min + "\n");
			sum = 0;
			min = 100;
		}
		
		bw.flush();
		bw.close();
	}
}