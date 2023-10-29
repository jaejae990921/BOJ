import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = new String[5];
		int max = 0;

		for (int i = 0; i < 5; i++) {
			arr[i] = br.readLine();
			max = Math.max(max, arr[i].length());
		}

		for (int j = 0; j < max; j++) {
			for (int k = 0; k < 5; k++) {
				if (arr[k].length() > j) {
					bw.write(arr[k].charAt(j));
				}
			}
		}

		bw.flush();
		bw.close();
	}
}