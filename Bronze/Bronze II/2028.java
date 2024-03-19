import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String numSquare, numStr;
        int num, len;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            num = Integer.parseInt(br.readLine());

            numSquare = String.valueOf(num * num);
            numStr = String.valueOf(num);
            len = numStr.length();

            if (numSquare.substring(numSquare.length() - len).equals(numStr)) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}