import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum, n, q, p;

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            sum = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());

                q = Integer.parseInt(st.nextToken());
                p = Integer.parseInt(st.nextToken());

                sum += q * p;
            }

            System.out.println(sum);
        }
    }
}