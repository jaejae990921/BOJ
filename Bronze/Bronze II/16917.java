import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        long sum = 0;

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        if (A + B > 2 * C) {
            if (X > Y) {
                sum += 2 * C * Y;
                if (A > 2 * C) {
                    sum += 2 * C * (X - Y);
                } else {
                    sum += A * (X - Y);
                }
            } else {
                sum += 2 * C * X;
                if (B > 2 * C) {
                    sum += 2 * C * (Y - X);
                } else {
                    sum += B * (Y - X);
                }
            }
        } else {
            sum += A * X + B * Y;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}