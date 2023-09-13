import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int L = Integer.parseInt(br.readLine());
		double A = Integer.parseInt(br.readLine());
		double B = Integer.parseInt(br.readLine());
		double C = Integer.parseInt(br.readLine());
		double D = Integer.parseInt(br.readLine());

		bw.write(L - (int)Math.max(Math.ceil(A / C), Math.ceil(B / D)) + "");
		bw.flush();
		bw.close();
	}
}