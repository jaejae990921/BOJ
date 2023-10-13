import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] croatia = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
		String str = br.readLine();

		for (int i = 0; i < croatia.length; i++) {
			if (str.contains(croatia[i])) {
				str = str.replaceAll(croatia[i], " ");
			}
		}

		bw.write(str.length() + "");
		bw.flush();
		bw.close();
	}
}