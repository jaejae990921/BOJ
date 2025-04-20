import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] baseball = new boolean[988];
        StringTokenizer st;
        String input = "", numStr = "", kStr = "";
        int num = 0, strike = 0, ball = 0, cnt = 0, strikeCount = 0, ballCount = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 123; i <= 987; i++) {
            input = String.valueOf(i);

            if (input.contains("0")) {
                continue;
            }

            if (input.charAt(0) == input.charAt(1) || input.charAt(0) == input.charAt(2)
                    || input.charAt(1) == input.charAt(2)) {
                continue;
            }

            baseball[i] = true;
        }

        for (int j = 0; j < N; j++) {
            st = new StringTokenizer(br.readLine());

            num = Integer.parseInt(st.nextToken());
            strike = Integer.parseInt(st.nextToken());
            ball = Integer.parseInt(st.nextToken());

            for (int k = 123; k <= 987; k++) {
                if (!baseball[k]) {
                    continue;
                }

                numStr = String.valueOf(num);
                kStr = String.valueOf(k);
                strikeCount = 0;
                ballCount = 0;

                for (int l = 0; l < 3; l++) {
                    if (numStr.charAt(l) == kStr.charAt(l)) {
                        strikeCount++;
                    } else if (numStr.contains(String.valueOf(kStr.charAt(l)))) {
                        ballCount++;
                    }
                }

                if (strikeCount != strike || ballCount != ball) {
                    baseball[k] = false;
                }
            }
        }

        for (int o = 123; o <= 987; o++) {
            if (baseball[o]) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}