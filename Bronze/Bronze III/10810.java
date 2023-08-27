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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] bucket = new int[Integer.parseInt(st.nextToken())];
		int M = Integer.parseInt(st.nextToken());
		String[] str;

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int start = Integer.parseInt(str[0]) - 1;
			int end = Integer.parseInt(str[1]) - 1;
			int num = Integer.parseInt(str[2]);

			for (int j = start; j <= end; j++) {
				bucket[j] = num;
			}
		}

		for (int i = 0; i < bucket.length; i++) {
			bw.write(bucket[i] + " ");
		}

		bw.flush();
		bw.close();
	}
}