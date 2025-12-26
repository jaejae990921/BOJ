import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "", temp = "", answer = "";

        while ((input = br.readLine()) != null) {
            answer = "";

            for (int i = 0; i < input.length(); i++) {
                temp = String.valueOf(input.charAt(i));

                switch (temp) {
                    case "i":
                        answer += "e";
                        break;
                    case "e":
                        answer += "i";
                        break;
                    case "I":
                        answer += "E";
                        break;
                    case "E":
                        answer += "I";
                        break;
                    default:
                        answer += temp;
                        break;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}