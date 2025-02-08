import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sCnt = 0, tCnt = 0;

        int N = Integer.parseInt(br.readLine());
        String sodduck = br.readLine();

        for (int i = 0; i < N; i++) {
            if (sodduck.charAt(i) == 's') {
                sCnt++;
            } else {
                tCnt++;
            }
        }

        for (int j = 0; j < N; j++) {
            if (sCnt == tCnt) {
                sb.append(sodduck.substring(j));
                break;
            } else if (sodduck.charAt(j) == 's') {
                sCnt--;
            } else {
                tCnt--;
            }
        }

        System.out.println(sb);
    }
}