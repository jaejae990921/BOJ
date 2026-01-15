import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int P = 0;

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        P = 10 + 2 * (25 - A + T);

        if (P < 1) {
            P = 0;
        }

        sb.append(P);
        System.out.println(sb);
    }
}
