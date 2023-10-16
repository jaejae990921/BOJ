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
		String[] str = new String[N];
		String result = "";

		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}

		if (N == 1) {
			bw.write(str[0]);
		} else {
			for (int i = 0; i < str[0].length(); i++) {
				boolean flag = true;
				for (int j = 1; j < N; j++) {
					if (str[0].charAt(i) != str[j].charAt(i)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					result += str[0].charAt(i);
				} else {
					result += "?";
				}
			}

			bw.write(result);
		}

		bw.flush();
		bw.close();
	}
}