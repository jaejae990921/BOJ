import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int Acnt = 0, Bcnt = 0;
        int A, B;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if (A > B) {
                Acnt++;
            } else if (A < B) {
                Bcnt++;
            }
        }

        sb.append(Acnt).append(" ").append(Bcnt);
        System.out.println(sb);
    }
}