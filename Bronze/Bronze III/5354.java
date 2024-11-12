import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (j == 0 || j == n - 1 || k == 0 || k == n - 1) {
                        sb.append("#");
                    } else {
                        sb.append("J");
                    }
                }

                sb.append("\n");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}