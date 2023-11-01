import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;

		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == -1) break;
			calc(N);
		}
		
		br.close();
	}

	public static void calc(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				list.add(i);
				sum += i;
			}
		}

		if (sum == num) {
			sb.append(num + " = ");
			for (int j = 0; j < list.size(); j++) {
				if (j == list.size() - 1) {
					sb.append(list.get(j));
				} else {
					sb.append(list.get(j) + " + ");
				}
			}
		} else {
			sb.append(num + " is NOT perfect.");
		}

		System.out.println(sb);
	}
}