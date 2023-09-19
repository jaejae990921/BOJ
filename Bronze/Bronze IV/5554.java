import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int input = 0;

		for (int i = 0; i < 4; i++) {
			input += Integer.parseInt(br.readLine());
		}

		int min = input / 60;
		int sec = input % 60;
	
		bw.write(min + "\n" + sec);
		bw.flush();
		bw.close();
	}
}