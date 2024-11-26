import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        long N = Long.parseLong(br.readLine());

        while (N > 3) {
            N = N / 2 + (N % 2 == 1 ? 1 : 0);
            cnt++;
        }

        sb.append(cnt + N);
        System.out.println(sb);
    }
}