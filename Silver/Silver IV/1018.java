import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String NM = br.readLine();
		int N = Integer.parseInt(NM.split(" ")[0]);
		int M = Integer.parseInt(NM.split(" ")[1]);
		int min = 64;

		String[][] chess = new String[N][M];

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				chess[i][j] = line.charAt(j) + "";
			}
		}

		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				int count = calc(i, j, chess);
				if (count < min) {
					min = count;
				}
			}
		}

		bw.write(min + "\n");
		bw.flush();
		bw.close();
	}

	public static int calc(int x, int y, String[][] chess) {
		int count = 0;
		String color = "W";
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				if (!chess[i][j].equals(color)) {
					count++;
				}

				if(color.equals("W")) {
					color = "B";
				} else {
					color = "W";
				}
			}

			if(color.equals("W")) {
				color = "B";
			} else {
				color = "W";
			}
		}

		count = Math.min(count, 64 - count);

		return count;
	}
}