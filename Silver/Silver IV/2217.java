import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = 0;

		int N = Integer.parseInt(br.readLine());
		int[] rope = new int[N];

		for (int i = 0; i < N; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(rope);

		for (int j = 0; j < N; j++) {
			max = Math.max(max, rope[j] * (N - j));
		}

		sb.append(max);
		System.out.println(sb);
	}
}