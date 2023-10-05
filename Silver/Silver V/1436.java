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
		int cnt = 0;
		String str = "666";

		while (true) {
			if (str.contains("666")) {
				cnt++;
			}
			if (cnt == N) {
				bw.write(str);
				break;
			}
			str = String.valueOf(Integer.parseInt(str) + 1);
		}

		bw.flush();
		bw.close();
	}
}