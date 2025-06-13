import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		BigInteger total = new BigInteger(br.readLine());
		BigInteger more = new BigInteger(br.readLine());
		BigInteger divide = new BigInteger("2");
		BigInteger half = total.subtract(more).divide(divide);

		sb.append(half.add(more)).append("\n").append(half);
		System.out.println(sb);
	}
}