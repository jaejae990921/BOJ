import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] pub = {"bigdata", "public", "society"};

		String str =  br.readLine();
		
		if (str.contains("bigdata") || str.contains("public") || str.contains("society")) {
			sb.append("public bigdata");
		} else {
			sb.append("digital humanities");
		}

		System.out.print(sb);
	}
}
