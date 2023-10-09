import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int change = 1000 - Integer.parseInt(br.readLine());
		int[] coins = { 500, 100, 50, 10, 5, 1 };
		int count = 0;

		for (int coin : coins) {
			count += change / coin;
			change %= coin;
		}

		bw.write(count + "");
		bw.flush();
		bw.close();
	}
}