import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a, b;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sb.append(lcm(a, b)).append(" ").append(gcd(a, b)).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) { // 최대공약수
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lcm(int a, int b) { // 최소공배수
        return a * b / gcd(a, b);
    }
}