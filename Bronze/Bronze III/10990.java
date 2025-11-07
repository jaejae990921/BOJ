import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j > i; j--) {
                sb.append(" ");
            }

            sb.append("*");

            for (int k = 0; k < 2 * i - 1; k++) {
                sb.append(" ");
            }

            if (i > 0) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}