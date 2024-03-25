import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int c, v;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            c = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            sb.append("You get ").append(c / v).append(" piece(s) and your dad gets ").append(c % v).append(" piece(s).\n");
        }

        System.out.print(sb);
    }
}