import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String answer = "";

		String input = br.readLine();

		switch (input) {
			case "NLCS":
				answer = "North London Collegiate School";
				break;
			case "BHA":
				answer = "Branksome Hall Asia";
				break;
			case "KIS":
				answer = "Korea International School";
				break;
			case "SJA":
				answer = "St. Johnsbury Academy";
				break;
		}

		sb.append(answer);
		System.out.println(sb);
	}
}
