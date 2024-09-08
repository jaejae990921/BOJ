import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cookie, eat, day;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            cookie = Integer.parseInt(st.nextToken());
            eat = Integer.parseInt(st.nextToken());

            day = 0;

            while (cookie > 0) {
                cookie -= eat;
                day++;
            }

            sb.append(day).append("\n");
        }

        System.out.println(sb);
    }
}