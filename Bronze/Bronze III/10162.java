import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A, B, C;

		int num = Integer.parseInt(br.readLine());

		if (num % 10 > 0) {
			bw.write("-1");
		} else {
			A = num / 300;
			B = (num % 300) / 60;
			C = ((num % 300) % 60) / 10;
			bw.write(A + " " + B + " " + C);
		}

		bw.flush();
		bw.close();
	}
}