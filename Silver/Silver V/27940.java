import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t, r, sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            t = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());

            sum += r;

            if (sum > K) {
                sb.append(i + 1 + " " + 1);
                break;

            }
        }

        if (sb.length() == 0) {
            sb.append("-1");
        }

        System.out.println(sb);
    }
}