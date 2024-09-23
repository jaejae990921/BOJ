import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean flag = false;
        int wCnt, idx;

        int n = Integer.parseInt(br.readLine());
        char[] breed = new char[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            breed[i] = st.nextToken().charAt(0);
        }

        st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine());
            wCnt = 0;

            for (int l = 0; l < k; l++) {
                idx = Integer.parseInt(st.nextToken()) - 1;

                if (breed[idx] == 'W') {
                    wCnt++;
                }
            }

            flag = wCnt == k ? true : false;

            if (flag) {
                break;
            }
        }

        sb.append(flag ? "W" : "P");
        System.out.println(sb);
    }
}