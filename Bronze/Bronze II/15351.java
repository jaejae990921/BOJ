import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int score = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input = br.readLine().replace(" ", "");
            score = 0;

            for (int j = 0; j < input.length(); j++) {
                score += (input.charAt(j) - 'A' + 1);
            }

            if (score == 100) {
                sb.append("PERFECT LIFE");
            } else {
                sb.append(score);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}