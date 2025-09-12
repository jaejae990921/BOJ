import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine().replaceAll(" ", "");
        int num = Integer.parseInt(input);

        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                sb.append("DeadMan").append("\n");
            } else if (i % 3 == 0) {
                sb.append("Dead").append("\n");
            } else if (i % 5 == 0) {
                sb.append("Man").append("\n");
            } else {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }
}