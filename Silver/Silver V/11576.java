import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int num, sum = 0;

		st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		for (int i = m - 1; i >= 0; i--) {
			num = Integer.parseInt(st.nextToken());
			sum += num * Math.pow(A, i);
		}

		while (sum > 0) {
			list.add(sum % B);
			sum /= B;
		}

		Collections.reverse(list);

		for (int i : list) {
			sb.append(i + " ");
		}

		System.out.println(sb);
	}
}