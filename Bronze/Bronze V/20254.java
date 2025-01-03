import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ur = Integer.parseInt(st.nextToken()) * 56;
        int tr = Integer.parseInt(st.nextToken()) * 24;
        int uo = Integer.parseInt(st.nextToken()) * 14;
        int to = Integer.parseInt(st.nextToken()) * 6;
        int sum = ur + tr + uo + to;

		sb.append(sum);
		System.out.println(sb);
	}
}
