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
		int sum = 0;
		int min = 0;

		for (int i = M; i <= N; i++) {
			if (isPrime(i)) {
				if (min == 0) {
					min = i;
				}
				sum += i;
			}
		}

		if (sum == 0) {
			bw.write("-1");
		} else {
			bw.write(sum + "\n");
			bw.write(min + "");
		}

		bw.flush();
		bw.close();
	}

	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			} 
		}

		return true;
	}
}