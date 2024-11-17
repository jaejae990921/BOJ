import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int left, right, input;
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            input = left = right = Integer.parseInt(st.nextToken());

            if (T % input == 0) {
                continue;
            } else {
                while (true) {
                    left -= 1;
                    right += 1;
                    cnt += 1;

                    if (T % left == 0 || T % right == 0) {
                        break;
                    }
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}