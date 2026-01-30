import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = 0;

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            N = Integer.parseInt(br.readLine());

            if (N <= 25) {
                sb.append("Case #").append(i).append(": ").append("World Finals").append("\n");
            } else if (N <= 1000) {
                sb.append("Case #").append(i).append(": ").append("Round 3").append("\n");
            } else if (N <= 4500) {
                sb.append("Case #").append(i).append(": ").append("Round 2").append("\n");
            } else {
                sb.append("Case #").append(i).append(": ").append("Round 1").append("\n");
            }
        }

        System.out.println(sb);
    }
}