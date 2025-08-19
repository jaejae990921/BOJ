import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String star = "*";
        int n;

        while ((n = Integer.parseInt(br.readLine())) != 0) {
            for (int i = 1; i <= n; i++) {
                sb.append(star.repeat(i)).append("\n");
            }
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}