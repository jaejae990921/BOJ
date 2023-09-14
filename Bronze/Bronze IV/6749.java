import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int third = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		int first = second + (second - third);

		bw.write(first + "");
		bw.flush();
		bw.close();
	}
}