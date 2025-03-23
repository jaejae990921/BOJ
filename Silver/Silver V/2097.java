import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sqrt;

        int N = Integer.parseInt(br.readLine());

        if (N == 1 || N == 2) {
            sb.append(4);
        } else {
            sqrt = (int) (Math.round(Math.sqrt(N)));

            if (sqrt * sqrt >= N) {
                sb.append((sqrt - 1) * 4);
            } else {
                sb.append(4 * sqrt - 2);
            }
        }

        System.out.println(sb);
    }
}