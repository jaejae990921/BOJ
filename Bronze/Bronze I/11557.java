import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String school = "", name;
        int score, max, N;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());

            max = 0;

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                name = st.nextToken();
                score = Integer.parseInt(st.nextToken());

                if (score > max) {
                    max = score;
                    school = name;
                }
            }

            sb.append(school).append("\n");
        }

        System.out.println(sb);
    }
}