import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int len = 0, temp = 0;

        while ((input = br.readLine()) != null) {
            if (input.equals("0")) {
                break;
            }

            while (input.length() > 1) {
                temp = 0;
                len = input.length();

                for (int i = 0; i < len; i++) {
                    temp += (input.charAt(i) - '0');
                }

                input = String.valueOf(temp);
            }

            sb.append(input).append("\n");
        }

        System.out.print(sb);
    }
}