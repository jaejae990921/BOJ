import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n, max;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            max = n;

            while (n != 1) {
                n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
                max = Math.max(max, n);
            }

            sb.append(max).append("\n");
        }

        System.out.println(sb);
    }
}