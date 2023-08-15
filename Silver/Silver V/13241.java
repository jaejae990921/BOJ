import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);

		long gcd = gcd(a, b);
		
		bw.write((a * b) / gcd + "\n");
		bw.flush();
		bw.close();
	}

	public static long gcd(long a, long b) {
		while (b > 0) {
			long tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}
}