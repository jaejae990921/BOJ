import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                cnt += i;
            }
        }

        cnt = cnt * 5 - 24;

        sb.append(cnt);
        System.out.println(sb);
    }
}