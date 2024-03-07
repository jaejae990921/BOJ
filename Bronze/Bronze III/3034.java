import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int L;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            L = Integer.parseInt(br.readLine());

            if (L * L <= W * W + H * H) {
                sb.append("DA\n");
            } else {
                sb.append("NE\n");
            }
        }

        System.out.println(sb);
    }
}