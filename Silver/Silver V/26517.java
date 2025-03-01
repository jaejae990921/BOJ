import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long d = Integer.parseInt(st.nextToken());

        long r1 = a * k + b;
        long r2 = c * k + d;

        if (r1 == r2) {
            sb.append("Yes " + r1);
        } else {
            sb.append("No");
        }

        System.out.println(sb);
    }
}
