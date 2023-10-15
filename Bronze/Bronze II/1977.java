import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0; // 합
		int min = 0; // 최소값

		for (int i = M; i <= N; i++) {
			// 제곱수면 sum += i
			if (isSquare(i)) {
				sum += i;
				if (min == 0) { // 최소값이 0이면 i로 초기화
					min = i;
				}
			}
		}

		if (sum == 0) { // 합이 0이면 -1 출력
			bw.write("-1");
		} else {
			bw.write(sum + "\n" + min); // 합 \n 최소값 출력
		}

		bw.flush();
		bw.close();
	}

	public static boolean isSquare(int num) {
		boolean flag = false;
		int sqrt = (int) Math.sqrt(num); // 제곱근
		flag = sqrt * sqrt == num ? true : false; // 제곱근 * 제곱근이 num이면 완전제곱수

		return flag;
	}
}