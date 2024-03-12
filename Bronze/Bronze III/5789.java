import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer, str;
        int len;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            str = br.readLine();
            len = str.length() / 2;

            if (str.charAt(len) == str.charAt(len - 1)) {
                answer = "Do-it";
            } else {
                answer = "Do-it-Not";
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}