import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = 1, b = 1, temp;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N-- > 0) {
            a += A;
            b += B;

            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            } else if (a == b) {
                b--;
            }
        }

        sb.append(a).append(" ").append(b);
        System.out.println(sb);
    }
}