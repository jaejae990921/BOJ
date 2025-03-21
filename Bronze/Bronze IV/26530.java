import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        double price, sum = 0;
        String product;
        int N, cnt;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            sum = 0;

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                product = st.nextToken();
                cnt = Integer.parseInt(st.nextToken());
                price = Double.parseDouble(st.nextToken());

                sum += price * cnt;
            }

            sb.append(String.format("$%.2f\n", sum));
        }

        System.out.println(sb);
    }
}