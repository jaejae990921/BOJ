import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());

            sb.append("Pairs for " + N + ": ");

            for (int j = 1; j <= N / 2; j++) {
                if (j != (N - j)) {
                    if (j > 1) {
                        sb.append(", ");
                    }
                    sb.append(j + " " + (N - j));
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}