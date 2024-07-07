import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String star = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            star += "* ";
        }

        for (int j = 1; j <= N; j++) {
            if (j % 2 == 0) {
                sb.append(" ");
            }

            sb.append(star).append("\n");
        }

        System.out.println(sb);
    }
}