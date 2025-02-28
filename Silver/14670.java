import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String answer = "";
		int name, efficacy, cnt, find;

		HashMap<Integer, Integer> map = new HashMap<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			efficacy = Integer.parseInt(st.nextToken());
			name = Integer.parseInt(st.nextToken());

			map.put(efficacy, name);
		}

		int M = Integer.parseInt(br.readLine());

		for (int j = 0; j < M; j++) {
			answer = "";
			st = new StringTokenizer(br.readLine());

			cnt = Integer.parseInt(st.nextToken());

			for (int k = 0; k < cnt; k++) {
				find = Integer.parseInt(st.nextToken());

				if (map.containsKey(find)) {
					answer += map.get(find) + " ";
				} else {
					answer = "YOU DIED";
					break;
				}
			}

			sb.append(answer);
			sb.append("\n");
		}

		System.out.println(sb);
	}
}
