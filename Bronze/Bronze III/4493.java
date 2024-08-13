import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n, oneSc, twoSc;
		char one, two;

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			oneSc = 0;
			twoSc = 0;

			n = Integer.parseInt(br.readLine());

			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());

				one = st.nextToken().charAt(0);
				two = st.nextToken().charAt(0);

				if (one == 'R' && two == 'S' || one == 'P' && two == 'R' || one == 'S' && two == 'P') {
					oneSc++;
				} else if (one == 'S' && two == 'R' || one == 'R' && two == 'P' || one == 'P' && two == 'S') {
					twoSc++;
				}
			}

			sb.append(oneSc > twoSc ? "Player 1\n" : oneSc < twoSc ? "Player 2\n" : "TIE\n");
		}

		System.out.println(sb);
	}
}