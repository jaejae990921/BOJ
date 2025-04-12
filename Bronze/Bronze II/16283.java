import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            if (i * a + (n - i) * b == w) {
                cnt++;
            }
        }

        if (cnt != 1) {
            sb.append("-1");
        } else {
            for (int i = 1; i < n; i++) {
                if (i * a + (n - i) * b == w) {
                    sb.append(i).append(" ").append(n - i);
                }
            }
        }

        System.out.println(sb);
    }
}