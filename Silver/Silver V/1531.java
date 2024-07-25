import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] map = new int[101][101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x1, y1, x2, y2, cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			mosaic(x1, y1, x2, y2);
		}

		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (map[i][j] > M) {
					cnt++;
				}
			}
		}

		sb.append(cnt);
		System.out.println(sb);
	}

	static void mosaic(int x1, int y1, int x2, int y2) {
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				map[i][j]++;
			}
		}

	}
}