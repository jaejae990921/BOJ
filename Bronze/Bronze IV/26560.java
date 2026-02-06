import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            input = br.readLine();

            if (input.charAt(input.length() - 1) == '.') {
                sb.append(input).append("\n");
            } else {
                sb.append(input).append(".\n");
            }
        }

        System.out.println(sb);
    }
}