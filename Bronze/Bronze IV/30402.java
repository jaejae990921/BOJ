import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "", answer = "";

        for (int i = 0; i < 15; i++) {
            input = br.readLine().replaceAll(" ", "");

            for (int j = 0; j < input.length(); j++) {
                switch (input.charAt(j)) {
                    case 'w':
                        answer = "chunbae";
                        break;
                    case 'b':
                        answer = "nabi";
                        break;
                    case 'g':
                        answer = "yeongcheol";
                        break;
                }
            }

            if (!answer.equals("")) {
                sb.append(answer);
                break;
            }
        }

        System.out.println(sb);
    }
}