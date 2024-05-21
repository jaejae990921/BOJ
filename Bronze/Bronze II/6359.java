import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] run;
        int room, cnt;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            room = Integer.parseInt(br.readLine());
            run = new boolean[room + 1];

            for (int j = 1; j <= room; j++) {
                for (int k = j; k <= room; k += j) {
                    run[k] = !run[k];
                }
            }

            cnt = 0;

            for (int j = 1; j <= room; j++) {
                if (run[j]) {
                    cnt++;
                }
            }

            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }
}