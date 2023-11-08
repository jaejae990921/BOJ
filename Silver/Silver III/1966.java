import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int N, M;

		for (int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" ");
			N = Integer.parseInt(str[0]);
			M = Integer.parseInt(str[1]);

			str = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				list.add(Integer.parseInt(str[j]));
			}

			bw.write(pQueue(N, M) + "\n");
			list.clear();
		}

		bw.flush();
		bw.close();
		br.close();
	}

	public static int pQueue(int N, int M) {
		int cnt = 0;

		while (true) {
			int max = 0;

			for (int i = 0; i < list.size(); i++) {
				if (max < list.get(i)) {
					max = list.get(i);
				}
			}

			if (list.get(0) != max) {
				list.add(list.get(0));
				list.remove(0);
				if (M == 0) {
					M = list.size() - 1;
				} else {
					M--;
				}
			} else {
				list.remove(0);
				cnt++;
				if (M == 0) {
					break;
				} else {
					M--;
				}
			}
		}

		return cnt;
	}
}