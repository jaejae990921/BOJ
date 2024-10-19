import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int m, cnt;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            cnt = 0;

            for (int j = 0; j < m; j++) {
                if (st.nextToken().equals("sheep")) {
                    cnt++;
                }
            }

            sb.append("Case " + (i + 1) + ": This list contains " + cnt + " sheep.\n\n");
        }

        System.out.println(sb);
    }
}