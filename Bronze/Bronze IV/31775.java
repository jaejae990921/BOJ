import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int lCnt = 0, kCnt = 0, pCnt = 0;
        String str = "";

        for (int i = 0; i < 3; i++) {
            str = br.readLine();

            if (str.charAt(0) == 'l') {
                lCnt++;
            } else if (str.charAt(0) == 'k') {
                kCnt++;
            } else if (str.charAt(0) == 'p') {
                pCnt++;
            }
        }

        boolean flag = lCnt == 1 && kCnt == 1 && pCnt == 1;

        sb.append(flag ? "GLOBAL" : "PONIX");
        System.out.println(sb);
    }
}
