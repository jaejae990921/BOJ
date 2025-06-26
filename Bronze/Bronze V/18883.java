import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int end = N * M;

		for (int i = 1; i <= end; i++) {
			if (cnt == M) {
				sb.setLength(sb.length() - 1);
				sb.append("\n");
				cnt = 0;
			}

			sb.append(i).append(" ");
			cnt++;
		}
        
    sb.setLength(sb.length() - 1);
		System.out.println(sb);
	}
}
