import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] time = br.readLine().split(" ");
		int h = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);
		int s = Integer.parseInt(time[2]);

		int t = Integer.parseInt(br.readLine());

		s += t;
		m += s / 60;
		s %= 60;
		h += m / 60;
		m %= 60;
		h %= 24;

		bw.write(h + " " + m + " " + s);
		bw.flush();
		bw.close();
	}
}