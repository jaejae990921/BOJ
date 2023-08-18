import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		String[] arr = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			if (primeN(Integer.parseInt(arr[i]))) cnt++;
		}

		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}

	public static boolean primeN (int n) {
		if (n == 1) return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}

		return true;
	}
}