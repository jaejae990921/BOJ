import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        long N = Long.parseLong(br.readLine());

        for (int i = 0; i < N; i++) {
            sum += (N + 1) * i;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}