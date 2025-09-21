import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            cnt++;
            sb.append(i).append(" ");

            if (cnt == 6) {
                sb.append("Go!").append(" ");
                cnt = 0;
            }
        }

        if (cnt != 0) {
            sb.append("Go!").append(" ");
        }

        System.out.println(sb);
    }
}