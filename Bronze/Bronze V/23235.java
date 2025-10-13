import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int idx = 1;

        while ((input = br.readLine()) != null) {
            if (input.equals("0")) {
                break;
            }

            sb.append("Case ").append(idx++).append(": Sorting... done!").append("\n");
        }

        System.out.println(sb);
    }
}