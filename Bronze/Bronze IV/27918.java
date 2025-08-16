import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int d = 0, p = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input = br.readLine();

            if (input.equals("D")) {
                d++;
            } else {
                p++;
            }

            if (d + 2 == p || p + 2 == d) {
                break;
            }
        }

        sb.append(d).append(":").append(p);
        System.out.println(sb);
    }
}