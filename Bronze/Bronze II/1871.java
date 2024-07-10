import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String front;
		int sum = 0, back;

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), "-");

			front = st.nextToken();
			back = Integer.parseInt(st.nextToken());

			sum = ((front.charAt(0) - 'A') * 26 * 26) + ((front.charAt(1) - 'A') * 26) + (front.charAt(2) - 'A');

			sb.append(Math.abs(sum - back) <= 100 ? "nice" : "not nice").append("\n");
		}

		System.out.println(sb);
	}
}