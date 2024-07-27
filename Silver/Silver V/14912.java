import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = n; i > 0; i--) {
            str = i + "";

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) - '0' == d) {
                    cnt++;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}