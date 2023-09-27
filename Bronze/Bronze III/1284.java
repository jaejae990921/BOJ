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
		int sum;

		while((str = br.readLine()) != null) {
			if (str.equals("0")) break;

			sum = 0;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') sum += 2;
				else if (str.charAt(i) == '0') sum += 4;
				else sum += 3;
			}

			sum += str.length() + 1;
			bw.write(sum + "\n");
		}

		bw.flush();
		bw.close();
	}
}