import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt((br.readLine()));
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int j = 0; j < M; j++) {
			int key = Integer.parseInt(st.nextToken());
			int result = binarySearch(key);
			sb.append(result).append("\n");
		}

		System.out.println(sb);
	}

	public static int binarySearch(int key) {
		boolean flag = false;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == key) {
				flag = true;
				break;
			} else if (arr[mid] > key) {
				right = mid - 1;
			} else if (arr[mid] < key) {
				left = mid + 1;
			}
		}

		return flag ? 1 : 0;
	}
}