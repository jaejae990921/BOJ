import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 280;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        if ((T >= 12 && T <= 16) && S == 0) {
            answer = 320;
        }

        sb.append(answer);
        System.out.println(sb);
    }
}