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
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		long cSize = Integer.parseInt(br.readLine());
		long cnt = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			cnt += arr[i] / cSize;
			if (arr[i] % cSize != 0) {
				cnt++;
			}
		}

		bw.write(cnt * cSize + "");
		bw.flush();
		bw.close();
	}
}