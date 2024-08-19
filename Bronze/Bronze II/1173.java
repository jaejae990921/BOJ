import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int time = 0, cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int X = m;

        while (cnt < N) {
            if (X + T <= M) {
                X += T;
                cnt++;
            } else {
                X -= R;
                if (X < m)
                    X = m;
            }
            time++;
            if (X + T > M && X == m) {
                sb.append(-1);
                break;
            }
        }

        if (cnt == N) {
            sb.append(time);
        }

        System.out.println(sb);
    }
}