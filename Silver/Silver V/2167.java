import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int i, j, x, y, sum = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for (int a = 0; a < N; a++) {
            st = new StringTokenizer(br.readLine());

            for (int b = 0; b < M; b++) {
                arr[a][b] = Integer.parseInt(st.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());

        for (int c = 0; c < K; c++) {
            st = new StringTokenizer(br.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for (int d = i - 1; d < x; d++) {
                for (int e = j - 1; e < y; e++) {
                    sum += arr[d][e];
                }
            }

            sb.append(sum + "\n");
            sum = 0;
        }

        System.out.println(sb);
    }
}