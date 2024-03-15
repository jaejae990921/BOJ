import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int time, s;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            time = Integer.parseInt(br.readLine());
            s = 1;

            while (s * (s + 1) <= time) {
                s++;
            }

            sb.append(s - 1).append('\n');
        }

        System.out.println(sb);
    }
}