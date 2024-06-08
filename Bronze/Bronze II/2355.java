import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long A = Math.min(N, M);
        long B = Math.max(N, M);

        long sum = (A + B) * ((B - A + 1) / 2);

        if ((B - A + 1) % 2 != 0) {
            sum += (A + B) / 2;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}