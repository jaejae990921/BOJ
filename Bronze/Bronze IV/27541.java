import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        if (S.charAt(N - 1) == 'G') {
            sb.append(S.substring(0, N - 1));
        } else {
            sb.append(S).append("G");
        }

        System.out.println(sb);
    }
}
