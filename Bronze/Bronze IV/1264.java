import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] mo = {'a', 'e', 'i', 'o', 'u'};
		String str;
		int cnt = 0;

		while((str = br.readLine()) != null) {
			if (str.equals("#")) {
				break;
			}
			
			str = str.toLowerCase();
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < mo.length; j++) {
					if (str.charAt(i) == mo[j]) {
						cnt++;
					}
				}
			}
			bw.write(cnt + "\n");
			cnt = 0;
		}
		bw.flush();
		bw.close();
	}
}