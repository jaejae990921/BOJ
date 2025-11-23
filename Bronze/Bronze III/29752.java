import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0, cnt = 0, num = 0;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());

            if (num != 0) {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                }
            } else {
                cnt = 0;
            }
        }

        sb.append(max);
        System.out.println(sb);
    }
}