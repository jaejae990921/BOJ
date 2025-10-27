import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = 0, prev = -1, curr = -1;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            curr = Integer.parseInt(st.nextToken());

            if (prev <= curr) {
                cnt++;
            }

            prev = curr;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}