import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int month = Integer.parseInt(br.readLine());
		int day = Integer.parseInt(br.readLine());

		if (month == 1) {
			bw.write("Before");
		} else if (month == 2) {
			if (day < 18) {
				bw.write("Before");
			} else if (day == 18) {
				bw.write("Special");
			} else {
				bw.write("After");
			}
		} else {
			bw.write("After");
		}

		bw.flush();
		bw.close();
	}
}