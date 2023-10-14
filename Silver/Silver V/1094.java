import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int stick = 64;
		int cnt = 0;
		int X = Integer.parseInt(br.readLine());

		while (X > 0) {
			if (stick > X) {
				stick /= 2;
			} else {
				X -= stick;
				cnt++;
			}
		}

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}