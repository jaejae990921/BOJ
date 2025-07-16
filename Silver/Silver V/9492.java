import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        String input;
        int n, half;

        while ((input = br.readLine()) != null) {
            n = Integer.parseInt(input);

            if (n == 0) {
                break;
            }

            q1.clear();
            q2.clear();

            half = n % 2 == 0 ? n / 2 : n / 2 + 1;

            for (int i = 1; i <= n; i++) {
                input = br.readLine();

                if (i <= half) {
                    q1.offer(input);
                } else {
                    q2.offer(input);
                }
            }

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    sb.append(q1.poll()).append("\n");
                } else {
                    sb.append(q2.poll()).append("\n");
                }
            }
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.println(sb);
    }
}