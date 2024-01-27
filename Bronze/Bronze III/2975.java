import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int A, B, sum = 0;
        String op;

        while (true) {
            st = new StringTokenizer(br.readLine());

            A = Integer.parseInt(st.nextToken());
            op = st.nextToken();
            B = Integer.parseInt(st.nextToken());

            if (A == 0 && op.equals("W") && B == 0) {
                break;
            }

            sum = op.equals("W") ? A - B : A + B;

            if (sum < -200) {
                sb.append("Not allowed\n");
            } else {
                sb.append(sum).append("\n");
            }
        }

        System.out.println(sb);
    }
}