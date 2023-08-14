import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] chess = {1, 1, 2, 2, 2, 8};

		String[] str = br.readLine().split(" ");

		for (int i = 0; i < 6; i++) {
			bw.write(chess[i] - Integer.parseInt(str[i]) + " ");
		}

		bw.flush();
		bw.close();
	}
}