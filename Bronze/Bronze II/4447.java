import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = "";
        int gCnt = 0, bCnt = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            name = br.readLine();
            gCnt = 0;
            bCnt = 0;

            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == 'g' || name.charAt(j) == 'G') {
                    gCnt++;
                } else if (name.charAt(j) == 'b' || name.charAt(j) == 'B') {
                    bCnt++;
                }
            }

            if (gCnt > bCnt) {
                sb.append(name).append(" is GOOD\n");
            } else if (gCnt < bCnt) {
                sb.append(name).append(" is A BADDY\n");
            } else {
                sb.append(name).append(" is NEUTRAL\n");
            }
        }

        System.out.println(sb);
    }
}