import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "";

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int len = Integer.parseInt(N);
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < len; i++) {
            sb.append(N);
        }

        answer = sb.length() > M ? sb.substring(0, M) : sb.toString();

        sb.setLength(0);
        sb.append(answer);
        System.out.println(sb);
    }
}