import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String word, drop, answer = "";
		char[] wordArr, dropArr;
		int idx = 1;

		while ((word = br.readLine()) != null) {
			drop = br.readLine();

			if (word.equals("END") && drop.equals("END")) {
				break;
			}

			wordArr = word.toCharArray();
			dropArr = drop.toCharArray();

			Arrays.sort(wordArr);
			Arrays.sort(dropArr);

			if (Arrays.equals(wordArr, dropArr)) {
				answer = "same";
			} else {
				answer = "different";
			}

			sb.append("Case " + idx + ": " + answer + "\n");

			idx++;
		}

		System.out.println(sb);
	}
}