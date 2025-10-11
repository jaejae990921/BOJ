import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = 0;

        int T = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            cnt += Integer.parseInt(st.nextToken());
        }

        if (T <= cnt) {
            sb.append("Padaeng_i Happy");
        } else {
            sb.append("Padaeng_i Cry");
        }

        System.out.println(sb);
    }
}