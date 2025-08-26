import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T, F, S, P, C, cnt;

        for (int i = 0; i < 2; i++) {
            cnt = 0;

            st = new StringTokenizer(br.readLine());
            T = Integer.parseInt(st.nextToken());
            F = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            cnt += (T * 6) + (F * 3) + (S * 2) + (P * 1) + (C * 2);
            sb.append(cnt).append(" ");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}