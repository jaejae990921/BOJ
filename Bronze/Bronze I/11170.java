import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            cnt = 0;

            for (int j = N; j <= M; j++) {
                int t = j;

                if (t == 0) {
                    cnt++;
                    continue;
                }

                while (t > 1) {
                    if (t % 10 == 0) {
                        cnt++;
                    }

                    t /= 10;
                }
            }
            
            System.out.println(cnt);
        }
	}
}