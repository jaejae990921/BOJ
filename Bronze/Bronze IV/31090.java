import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = 0, temp;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            temp = N % 100;

            if ((N + 1) % temp == 0) {
                sb.append("Good").append("\n");
            } else {
                sb.append("Bye").append("\n");
            }
        }

        System.out.println(sb);
    }
}