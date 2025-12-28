import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int aTmp = 0, bTmp = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        A = String.format("%7s", A).replace(' ', '0');
        B = String.format("%7s", B).replace(' ', '0');

        for (int i = 0; i < 7; i++) {
            aTmp = A.charAt(i) - '0';
            bTmp = B.charAt(i) - '0';

            answer += String.valueOf(aTmp + bTmp);
        }

        sb.append(answer.replaceFirst("^0+", ""));
        System.out.println(sb);
    }
}