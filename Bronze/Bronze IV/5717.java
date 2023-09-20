import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		while((str = br.readLine()) != null) {
			int m = Integer.parseInt(str.split(" ")[0]);
			int w = Integer.parseInt(str.split(" ")[1]);

			if (m == 0 && w == 0) {
				break;
			} else {
				bw.write(m + w + "\n");
			}
		}

		bw.flush();
		bw.close();
	}
}