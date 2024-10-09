import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String answer = "";
        String[] words;
        int cnt, n, k;

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            cnt = Integer.parseInt(br.readLine());
            words = new String[cnt];

            for (int j = 0; j < cnt; j++) {
                words[j] = br.readLine();
            }

            n = Integer.parseInt(br.readLine());

            sb.append("Scenario #" + (i + 1) + ":\n");

            for (int l = 0; l < n; l++) {
                answer = "";
                st = new StringTokenizer(br.readLine());

                k = Integer.parseInt(st.nextToken());

                for (int o = 0; o < k; o++) {
                    answer += words[Integer.parseInt(st.nextToken())];
                }

                sb.append(answer + "\n");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}