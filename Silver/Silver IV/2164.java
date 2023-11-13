import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[2 * N];

		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}

		int prevIdx = 1;
		int lastIdx = N;

		while(N > 1) {
			arr[++lastIdx] = arr[++prevIdx];
			prevIdx++;
			N--;
		}

		bw.write(arr[lastIdx] + "\n");
		bw.flush();
		bw.close();
	}
}