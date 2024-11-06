import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int A, B, cnt;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            cnt = 0;

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            while (A * 4 < B) {
                A++;
                cnt++;
            }

            if (A * 3 > B) {
                cnt += A * 3 - B;
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}