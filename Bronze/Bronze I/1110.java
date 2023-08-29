import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int real = num;
		int cnt = 0;

		do {
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			cnt++;
		} while (num != real);

		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}
}