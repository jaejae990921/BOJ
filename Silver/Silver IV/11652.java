import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long num = 0;

		HashMap<Long, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			num = Long.parseLong(br.readLine());

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		int max = -1;
		long maxNum = 0;

		for (long key : map.keySet()) {
			if (map.get(key) > max) {
				max = map.get(key);
				maxNum = key;
			} else if (map.get(key) == max) {
				maxNum = Math.min(maxNum, key);
			}
		}

		sb.append(maxNum);
		System.out.print(sb);
	}
}