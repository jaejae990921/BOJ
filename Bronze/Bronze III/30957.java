import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int bCnt = 0, sCnt = 0, aCnt = 0;

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        for (int i = 0; i < N; i++) {
            if (input.charAt(i) == 'B') {
                bCnt++;
            } else if (input.charAt(i) == 'S') {
                sCnt++;
            } else if (input.charAt(i) == 'A') {
                aCnt++;
            }
        }

        int maxCnt = Math.max(bCnt, Math.max(sCnt, aCnt));

        if (maxCnt == bCnt && maxCnt == sCnt && maxCnt == aCnt) {
            sb.append("SCU");
        } else {
            if (maxCnt == bCnt) {
                sb.append("B");
            }
            if (maxCnt == sCnt) {
                sb.append("S");
            }
            if (maxCnt == aCnt) {
                sb.append("A");
            }
        }

        System.out.println(sb);
    }
}