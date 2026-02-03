import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[][] arr;
        int max = 0, jinseo = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        arr = new int[N][N];

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (i == a - 1 && j == b - 1) {
                    jinseo = arr[i][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[i][b - 1] > max) {
                max = arr[i][b - 1];
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[a - 1][i] > max) {
                max = arr[a - 1][i];
            }
        }

        if (jinseo >= max) {
            sb.append("HAPPY");
        } else {
            sb.append("ANGRY");
        }

        System.out.println(sb);
    }
}