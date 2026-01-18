import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long N = Long.parseLong(br.readLine());

        if (N * N > 100_000_000) {
            sb.append("Time limit exceeded");
        } else {
            sb.append("Accepted");
        }

        System.out.println(sb);
    }
}