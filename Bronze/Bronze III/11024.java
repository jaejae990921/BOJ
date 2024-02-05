import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt, sum;
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            cnt = st.countTokens();
            sum = 0;

            for (int j = 0; j < cnt; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            System.out.println(sum);
        }
    }
}