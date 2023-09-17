import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> list = new ArrayList<String>();
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			String token = st.nextToken();
			if (list.contains(token)) {
				cnt++;
			} else {
				list.add(token);
			}
		}

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}