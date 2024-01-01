import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int l, p, v;

        int i = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());

            l = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            if (l == 0 && p == 0 && v == 0) {
                break;
            }

            int result = (v / p) * l + Math.min(v % p, l);

            sb.append("Case ").append(i).append(": ").append(result).append("\n");

            i++;
        }

        System.out.println(sb);
    }
}