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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());

		for (int i = start; i <= end; i++) {
			sum += cal(i);
		}

		bw.write(sum + "");
		bw.flush();
		bw.close();
	}

	public static int cal(int n) {
		int i = 0;

		while(true) {
			n = n - i;

			if (n <= 0) {
				break;
			}

			i++;
		}

		return i;
	}
}