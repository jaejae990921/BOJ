import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 0, d = 0, cnt = 0;

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            d = Integer.parseInt(br.readLine());

            if (d % 2 == 1) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}