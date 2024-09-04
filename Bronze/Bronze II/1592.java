import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int idx = 1, cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] people = new int[N + 1];

		while (true) {
			people[idx]++;

			if (people[idx] == M) {
				break;
			}

			if (people[idx] % 2 == 1) {
				idx = (idx + L) % N;
				if (idx == 0) {
					idx = N;
				}
			} else {
				idx = (idx - L) % N;
				if (idx <= 0) {
					idx += N;
				}
			}

			cnt++;
		}

		sb.append(cnt);
		System.out.println(sb);
	}
}