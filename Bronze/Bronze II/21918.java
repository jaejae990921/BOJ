import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a, b, c;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] blub = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            blub[i] = Integer.parseInt(st.nextToken()) == 1;
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            switch (a) {
                case 1:
                    blub[b] = c == 1;
                    break;
                case 2:
                    for (int k = b; k <= c; k++) {
                        blub[k] = !blub[k];
                    }
                    break;
                case 3:
                    for (int l = b; l <= c; l++) {
                        blub[l] = false;
                    }
                    break;
                case 4:
                    for (int m = b; m <= c; m++) {
                        blub[m] = true;
                    }
                    break;
            }
        }

        for (int n = 1; n <= N; n++) {
            sb.append(blub[n] ? 1 : 0).append(" ");
        }

        System.out.println(sb);
    }
}