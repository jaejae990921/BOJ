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

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N == 1) {
            cnt = 1;
        } else if (N == 2) {
            cnt = Math.min(4, ((M + 1) / 2));
        } else if (M < 7) {
            cnt = Math.min(4, M);
        } else if (M >= 7) {
            cnt = M - 2;
        }

        sb.append(cnt);
        System.out.print(sb);
    }
}