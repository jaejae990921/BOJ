import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[][] arrA = new int[M][N];

		int K = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int i = M - W + 1;
		int j = N - W + 1;
		int[][] arrB = new int[i][j];

		for (int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine());

			for (int l = 0; l < N; l++) {
				arrA[k][l] = Integer.parseInt(st.nextToken());
			}
		}

		for (int m = 0; m < i; m++) {
			for (int n = 0; n < j; n++) {
				arrB[m][n] = getMedian(arrA, m, n, W);
			}
		}

		for (int o = 0; o < i; o++) {
			for (int p = 0; p < j; p++) {
				sb.append(arrB[o][p] + " ");
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}

	public static int getMedian(int[][] arr, int i, int j, int W) {
		int[] temp = new int[W * W];
		int index = 0;

		for (int q = i; q < i + W; q++) {
			for (int r = j; r < j + W; r++) {
				temp[index++] = arr[q][r];
			}
		}

		Arrays.sort(temp);

		return temp[W * W / 2];
	}
}