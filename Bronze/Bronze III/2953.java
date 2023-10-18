import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int idx = 0, max = 0;

		for (int i = 0; i < 5; i++) {
			int sum = 0;
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < 4; j++) {
				sum += Integer.parseInt(str[j]);
			}
			if (sum > max) {
				max = sum;
				idx = i + 1;
			}
		}

		bw.write(idx + " " + max);
		bw.flush();
		bw.close();
	}
}