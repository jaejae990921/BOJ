import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;

		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break;
			}
		
			bw.write(func(a, b) + "\n");
		}

		bw.flush();
		bw.close();
	}

	public static String func(int a, int b) {
		if ( b % a == 0) {
			return "factor";
		} else if ( a % b == 0) {
			return "multiple";
		} else {
			return "neither";
		}
	}
}