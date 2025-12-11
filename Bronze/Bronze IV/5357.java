import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "", input = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input = br.readLine();
            answer = String.valueOf(input.charAt(0));

            for (int j = 1; j < input.length(); j++) {
                if (input.charAt(j) != input.charAt(j - 1)) {
                    answer += input.charAt(j);
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}