import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] dice = new int[7];
		String[] input = br.readLine().split(" ");
		int reward = 0;

		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);

		for (int i = 0; i < 3; i++) {
			dice[Integer.parseInt(input[i])]++;
		}

		for (int j = 1; j <= 6; j++) {
			if (dice[j] == 3) {
				reward = 10000 + j * 1000;
				break;
			} else if (dice[j] == 2) {
				reward = 1000 + j * 100;
				break;
			} else {
				int max = Math.max(a, Math.max(b, c));
				reward = max * 100;
			}
		}

		bw.write(reward + "\n");
		bw.flush();
		bw.close();
	}
}