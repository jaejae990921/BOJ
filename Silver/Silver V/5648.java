import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Long> list = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		while (n > 0) {
			while (st.hasMoreTokens()) {
				list.add(reverse(st.nextToken()));
				n--;
			}

			if (n > 0) {
				st = new StringTokenizer(br.readLine());
			}
		}

		Collections.sort(list);

		for (long l : list) {
			sb.append(l).append("\n");
		}

		System.out.println(sb);
	}

	static long reverse(String n) {
		String reverse = new StringBuilder(n).reverse().toString();
		return Long.parseLong(reverse);
	}
}