import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String str;
		int A, B;

		for (int i = 0; i < N; i++) {
			str = br.readLine();
			A = Integer.parseInt(str.split(" ")[0]);
			B = Integer.parseInt(str.split(" ")[1]);
			bw.write("yes\n");
		}

		bw.flush();
		bw.close();
	}
}