import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag;
        long num;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            num = Long.parseLong(br.readLine());
            flag = true;

            for (int j = 2; j <= 1_000_000; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}