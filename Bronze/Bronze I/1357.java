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

		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());

		bw.write(rev(rev(X) + rev(Y)) + "");
		bw.flush();
		bw.close();
	}

	public static int rev(int n) {
		int result = 0;

		while (n > 0) {
			result *= 10;
			result += n % 10;
			n /= 10;
		}

		return result;
	}
}