import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while (true) {
            if (k >= w) {
                break;
            }

            k += m;
            cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}