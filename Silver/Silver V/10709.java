import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int cnt;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[][] clouds = new int[H][W];
        int[][] answer = new int[H][W];

        for (int i = 0; i < H; i++) {
            str = br.readLine();

            for (int j = 0; j < W; j++) {
                clouds[i][j] = str.charAt(j);
                answer[i][j] = clouds[i][j] == 'c' ? 0 : -1;
            }
        }

        for (int k = 0; k < H; k++) {
            for (int l = 0; l < W; l++) {
                if (answer[k][l] == 0) {
                    continue;
                }

                cnt = 1;

                for (int m = l - 1; m >= 0; m--) {
                    if (clouds[k][m] == 'c') {
                        answer[k][l] = cnt;
                        break;
                    }

                    cnt++;
                }
            }
        }

        for (int n = 0; n < H; n++) {
            for (int o = 0; o < W; o++) {
                sb.append(answer[n][o]).append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}