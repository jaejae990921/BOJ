import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a = 0, d = 0, g = 0, sum = 0, max = Integer.MIN_VALUE;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());

            sum = a * (d + g);
            if (a == (d + g)) {
                sum *= 2;
            }

            if (sum > max) {
                max = sum;
            }
        }

        sb.append(max);
        System.out.println(sb);
    }
}