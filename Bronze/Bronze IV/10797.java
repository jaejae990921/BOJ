import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			if (n == Integer.parseInt(nums[i])) {
				cnt++;
			}
		}

		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}
}