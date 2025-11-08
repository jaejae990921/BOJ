import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String[][] arr = new String[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0 && i % 11 != 0) {
                sb.append("Hurra!");
            } else if (i % 7 != 0 && i % 11 == 0) {
                sb.append("Super!");
            } else if (i % 7 == 0 && i % 11 == 0) {
                sb.append("Wiwat!");
            } else {
                sb.append(i);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}