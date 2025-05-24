import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (arr[i][j] == 1) {
                    if (x1 == 0 && y1 == 0) {
                        x1 = i + 1;
                        y1 = j + 1;
                    }
                    x2 = i + 1;
                    y2 = j + 1;
                }
            }
        }

        sb.append(Math.abs(x2 - x1) + Math.abs(y2 - y1));
        System.out.print(sb);
    }
}