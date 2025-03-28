import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int min = Integer.MAX_VALUE, p, a;
        boolean flag;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        for (int i = 0; i < H; i++) {
            flag = false;
            p = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < W; j++) {
                a = Integer.parseInt(st.nextToken());

                if (a >= N) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                if (p * N < min) {
                    min = p * N;
                }
            }
        }

        sb.append(min > B ? "stay home" : min);
        System.out.println(sb);
    }
}