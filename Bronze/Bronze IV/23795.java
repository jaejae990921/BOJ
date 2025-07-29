import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		int sum = 0;

		while ((input = br.readLine()) != null) {
			if (input.equals("-1")) {
				break;
			}

			sum += Integer.parseInt(input);
		}

		sb.append(sum);
		System.out.println(sb);
	}
}
