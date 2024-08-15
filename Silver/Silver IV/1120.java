import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 50;

        String X = st.nextToken();
        String Y = st.nextToken();

        for (int i = 0; i <= Y.length() - X.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < X.length(); j++) {
                if (X.charAt(j) != Y.charAt(i + j)) {
                    cnt++;
                }
            }
            ans = Math.min(ans, cnt);
        }

        sb.append(ans);
        System.out.println(sb);
    }
}