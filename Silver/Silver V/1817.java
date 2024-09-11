import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = 1, bag;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] books = new int[N];
		bag = M;

		if (N == 0) {
			sb.append(0);
			System.out.println(sb);
			return;
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			books[i] = Integer.parseInt(st.nextToken());
		}

		for (int j = 0; j < N; j++) {
			if (bag < books[j] || bag == 0) {
				cnt++;
				bag = M;
			}
			bag -= books[j];
		}

		sb.append(cnt);
		System.out.println(sb);
	}
}