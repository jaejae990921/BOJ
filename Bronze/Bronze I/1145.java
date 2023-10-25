import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int j = arr[0];

		while(true) {
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				if (j % arr[i] == 0) {
					cnt++;
				}
			}
			if (cnt >= 3) {
				bw.write(j + "");
				break;
			}
			j++;
		}

		bw.flush();
		bw.close();
	}
}