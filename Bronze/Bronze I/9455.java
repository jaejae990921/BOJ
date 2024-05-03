import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n, m, cnt = 0;
        int[][] arr;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            arr = new int[m + 1][n + 1];

            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            for (int l = 0; l < m; l++) {
                for (int o = 0; o < n; o++) {
                    if (arr[l][o] == 1) {
                        for (int p = l + 1; p < m; p++) {
                            if (arr[p][o] == 0) {
                                cnt++;
                            }
                        }
                    }
                }
            }

            sb.append(cnt).append("\n");
            cnt = 0;
        }

        System.out.println(sb);
    }
}