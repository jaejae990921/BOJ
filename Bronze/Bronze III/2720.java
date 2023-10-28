import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int Quarter, Dime, Nickel, Penny, C;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			C = Integer.parseInt(br.readLine());

			Quarter = C / 25;
			C %= 25;

			Dime = C / 10;
			C %= 10;

			Nickel = C / 5;
			C %= 5;

			Penny = C;

			bw.write(Quarter + " " + Dime + " " + Nickel + " " + Penny + "\n");
		}

		bw.flush();
		bw.close();
	}
}