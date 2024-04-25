import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean[][] arr = new boolean[100][100];
        int cnt = 0;
        int x, y, w, h;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            for (int j = x; j < w; j++) {
                for (int k = y; k < h; k++) {
                    arr[j][k] = true;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j]) {
                    cnt++;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}