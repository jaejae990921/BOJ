import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] primeNumber = new boolean[246913];
        int n, cnt = 0;

        primeNumber[0] = primeNumber[1] = true;

        for (int i = 2; i <= Math.sqrt(primeNumber.length); i++) {
            if (primeNumber[i]) {
                continue;
            }

            for (int j = i * i; j < primeNumber.length; j += i) {
                primeNumber[j] = true;
            }
        }

        while (true) {
            n = Integer.parseInt(br.readLine());
            cnt = 0;

            if (n == 0) {
                break;
            }

            for (int k = n + 1; k <= 2 * n; k++) {
                if (!primeNumber[k]) {
                    cnt++;
                }
            }

            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }
}