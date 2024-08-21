import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String name;

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			name = br.readLine();

			sb.append("String #").append(i).append("\n");

			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(j) == 'Z') {
					sb.append("A");
				} else {
					sb.append((char) (name.charAt(j) + 1));
				}
			}

			sb.append("\n\n");
		}

		System.out.println(sb);
	}
}