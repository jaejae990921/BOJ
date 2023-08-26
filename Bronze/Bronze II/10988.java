import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		bw.write(strcmp99(str) ? "1" : "0");
		bw.flush();
		bw.close();
	}

	public static boolean strcmp99(String str) {
		int len = str.length();
		int middle = str.length() / 2;
		boolean flag = false;
		for (int i = 0; i <= middle; i++) {
			if (str.charAt(i) == str.charAt(len - i - 1)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		if (flag) {
			return true;
		} else {
			return false;
		}
	}
}