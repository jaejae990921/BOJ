import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean isPrime;
        long n;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            n = Long.parseLong(br.readLine());

            if (n == 0 || n == 1) {
                sb.append(2).append('\n');
                continue;
            }

            while (true) {
                isPrime = true;

                for (long j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    sb.append(n).append('\n');
                    break;
                }
                n++;
            }
        }

        System.out.println(sb);
    }
}