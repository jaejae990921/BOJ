import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] A = new boolean[10001];
        boolean[] B = new boolean[10001];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int aJump = Integer.parseInt(st.nextToken());
        int bJump = Integer.parseInt(st.nextToken());
        int aStart = Integer.parseInt(st.nextToken());
        int bStart = Integer.parseInt(st.nextToken());

        for (int i = aStart; i < 10001; i += aJump) {
            A[i] = true;
        }

        for (int i = bStart; i < 10001; i += bJump) {
            B[i] = true;
        }

        for (int i = 1; i < 10001; i++) {
            if (A[i] && B[i]) {
                sb.append(i);
                break;
            }
        }

        if (sb.length() == 0) {
            sb.append("-1");
        }

        System.out.println(sb);
    }
}