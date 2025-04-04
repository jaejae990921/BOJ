import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		int x, y, num, cnt = 0;

		for (int i = 0; i < 4; i++) {
			input = br.readLine();

			for (int j = 0; j < 4; j++) {
				num = input.charAt(j) - 'A';

				if (num < 0) {
					continue;
				}

				x = num / 4;
				y = num % 4;

				cnt += Math.abs(x - i) + Math.abs(y - j);
			}
		}

		sb.append(cnt);
		System.out.println(sb);
	}
}