import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1, y1, r1, x2, y2, r2;
        double d;

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (d == 0 && r1 == r2) {
                sb.append("-1\n");
            } else if (d == r1 + r2 || d == Math.abs(r1 - r2)) {
                sb.append("1\n");
            } else if (d > r1 + r2 || d < Math.abs(r1 - r2)) {
                sb.append("0\n");
            } else {
                sb.append("2\n");
            }
        }

        System.out.println(sb);
    }
}