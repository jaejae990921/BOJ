import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] card = new char[R][C];
        char[][] answer = new char[R * 2][C * 2];

        for (int i = 0; i < R; i++) {
            card[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                answer[i][j] = card[i][j];
                answer[i][C * 2 - j - 1] = card[i][j];

                answer[R * 2 - i - 1][j] = card[i][j];
                answer[R * 2 - i - 1][C * 2 - j - 1] = card[i][j];
            }
        }

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        answer[A - 1][B - 1] = answer[A - 1][B - 1] == '#' ? '.' : '#';

        for (int k = 0; k < R * 2; k++) {
            for (int l = 0; l < C * 2; l++) {
                sb.append(answer[k][l]);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}