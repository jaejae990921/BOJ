public

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> map = new HashMap<>();
		String studentId;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= L; i++) {
			studentId = br.readLine();
			map.put(studentId, i);
		}

		List<String> keySet = new ArrayList<>(map.keySet());

		keySet.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o1).compareTo(map.get(o2));
			}
		});

		for (int j = 0; j < K; j++) {
			if (j >= keySet.size()) {
				break;
			}

			sb.append(keySet.get(j)).append("\n");
		}

		System.out.println(sb);
	}
}{

}
