import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger a = new BigInteger(br.readLine());
		char op = br.readLine().charAt(0);
		BigInteger b = new BigInteger(br.readLine());

		switch (op) {
		case '+':
			bw.write(a.add(b).toString());
			break;
		case '*':
			bw.write(a.multiply(b).toString());
			break;
		}

		bw.flush();
		bw.close();
	}
}