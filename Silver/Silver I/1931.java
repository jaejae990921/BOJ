import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<int[]> list = new ArrayList<int[]>();
		int start, end, cnt = 0, endTime = 0;

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			start = Integer.parseInt(input[0]);
			end = Integer.parseInt(input[1]);
			list.add(new int[] { start, end });
		}

		Collections.sort(list, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			} else {
				return o1[1] - o2[1];
			}
		});

		for (int i = 0; i < N; i++) {
			if (endTime <= list.get(i)[0]) {
				endTime = list.get(i)[1];
				cnt++;
			}
		}

		sb.append(cnt);
		System.out.println(sb);
	}
}