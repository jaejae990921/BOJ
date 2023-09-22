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
		String[] str = br.readLine().split(" ");
		int[] nums = new int[n];
		int answer = Integer.MIN_VALUE;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}

		for (int j = 0; j < n; j++) {
			cnt = 0;
			for (int k = j+1; k < n; k++) {
				if (nums[j] > nums[k]) {
					cnt++;
				} else {
					break;
				}
			}
			answer = Math.max(answer, cnt);
		}

		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}