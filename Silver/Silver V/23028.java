import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int major = 66, total = 130, X, Y, cnt;

        st = new StringTokenizer(br.readLine());

        int N = 8 - Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A >= major && B >= total) {
            sb.append("Nice");
        } else {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());

                X = Integer.parseInt(st.nextToken());
                Y = Integer.parseInt(st.nextToken());

                cnt = 6;

                while (cnt-- > 0) {
                    if (A < major && X > 0) {
                        A += 3;
                        B += 3;
                        X--;
                        continue;
                    }

                    if (B < total && Y > 0) {
                        B += 3;
                        Y--;
                        continue;
                    }

                }
            }

            if (A >= major && B >= total) {
                sb.append("Nice");
            } else {
                sb.append("Nae ga wae");
            }
        }

        System.out.println(sb);
    }
}