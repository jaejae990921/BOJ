import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long lcm = 1, num = 0;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N - 2; i++) {
            num = Long.parseLong(st.nextToken());
            lcm = lcm * num / getGcd(lcm, num);
        }

        sb.append(lcm);
        System.out.print(sb);
    }

    public static long getGcd(long a, long b) {
        long temp = 0;

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}