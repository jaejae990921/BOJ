import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        BigInteger one, two;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            one = new BigInteger(st.nextToken(), 2);
            two = new BigInteger(st.nextToken(), 2);

            sb.append(one.add(two).toString(2)).append("\n");
        }

        System.out.println(sb);
	}
}