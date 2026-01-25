import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int cnt = 0;

        for (int i = 0; i < 6; i++) {
            input = br.readLine();

            if (input.equals("W")) {
                cnt++;
            }
        }

        if (cnt > 4) {
            sb.append(1);
        } else if (cnt > 2) {
            sb.append(2);
        } else if (cnt > 0) {
            sb.append(3);
        } else {
            sb.append(-1);
        }

        System.out.println(sb);
    }
}