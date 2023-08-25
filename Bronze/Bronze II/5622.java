import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] alpha = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		String[] str = br.readLine().split("");
		int sum = 0;

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < alpha.length; j++) {
				if (alpha[j].contains(str[i])) {
					sum += j + 3;
					break;
				}
			}
		}

		bw.write(sum + "\n");
		bw.flush();
		bw.close();
    }
}