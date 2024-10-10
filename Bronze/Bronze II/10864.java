import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int A, B;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] friends = new int[N + 1];

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());

			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			friends[A]++;
			friends[B]++;
		}

		for (int i = 1; i <= N; i++) {
			sb.append(friends[i]).append("\n");
		}

		System.out.println(sb);
	}
}