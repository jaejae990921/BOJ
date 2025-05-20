import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = 0, num = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < K; i++) {
            num = Integer.parseInt(st.nextToken());

            if (num % 2 == 0) {
                cnt += num / 2;
            } else {
                cnt += (num / 2) + 1;
            }
        }

        sb.append(cnt >= N ? "YES" : "NO");
        System.out.print(sb);
    }
}