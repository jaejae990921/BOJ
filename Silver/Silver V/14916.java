import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int fCnt = 0, tCnt = 0;

        int n = Integer.parseInt(br.readLine());

        fCnt = n / 5;
        n %= 5;
        tCnt = n / 2;
        n %= 2;

        if (n == 0) {
            sb.append(fCnt + tCnt);
        } else {
            while (fCnt > 0) {
                fCnt--;
                n += 5;
                tCnt += n / 2;
                n %= 2;

                if (n == 0) {
                    sb.append(fCnt + tCnt);
                    break;
                }
            }

            if (n != 0) {
                sb.append(-1);
            }
        }

        System.out.println(sb);
    }
}