import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int x, y, w, h, cnt = 0;

        int[][] confetti = new int[1001][1001];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + w; j++) {
                for (int k = y; k < y + h; k++) {
                    confetti[j][k] = i + 1;
                }
            }
        }

        for (int l = 1; l <= N; l++) {
            for (int m = 0; m < 1001; m++) {
                for (int n = 0; n < 1001; n++) {
                    if (confetti[m][n] == l) {
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
            cnt = 0;
        }

        System.out.println(sb);
    }
}