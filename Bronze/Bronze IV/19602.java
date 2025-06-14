import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int S = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());

        int total = S + 2 * M + 3 * L;

        sb.append(total >= 10 ? "happy" : "sad");
        System.out.println(sb);
    }
}