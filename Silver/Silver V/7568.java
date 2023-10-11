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
		int[][] arr = new int[N][2];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}

		for (int j = 0; j < N; j++) {
			cnt = 1;
			for (int k = 0; k < N; k++) {
				if (arr[j][0] < arr[k][0] && arr[j][1] < arr[k][1]) {
					cnt++;
				}
			}
			bw.write(cnt + " ");
		}

		bw.flush();
		bw.close();
	}
}