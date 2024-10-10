import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int H1, H2, sleep = 0, d1Idx, d2Idx;
        StringTokenizer st;
        String D1, D2;

        String[] weekdays = { "Mon", "Tue", "Wed", "Thu", "Fri" };

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            D1 = st.nextToken();
            H1 = Integer.parseInt(st.nextToken());
            D2 = st.nextToken();
            H2 = Integer.parseInt(st.nextToken());

            if (D1.equals(D2)) {
                sleep += (H2 - H1);
            } else {
                d1Idx = 0;
                d2Idx = 0;

                for (int j = 0; j < 5; j++) {
                    if (weekdays[j].equals(D1)) {
                        d1Idx = j;
                    }
                    if (weekdays[j].equals(D2)) {
                        d2Idx = j;
                    }
                }

                sleep += (d2Idx - d1Idx) * 24 + (H2 - H1);
            }
        }

        sb.append(sleep >= T ? "0" : T - sleep > 48 ? "-1" : T - sleep);
        System.out.println(sb);
    }
}