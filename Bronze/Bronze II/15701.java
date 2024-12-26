import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                cnt++;
                if (i != N / i) {
                    cnt++;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}