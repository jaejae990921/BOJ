import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0, sum;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            sum = 0;

            for (int j = i; j <= N; j++) {
                sum += j;

                if (sum > N) {
                    break;
                } else if (sum == N) {
                    cnt++;
                    break;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}