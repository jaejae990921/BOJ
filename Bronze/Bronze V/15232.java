import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String star = "*";

        int R = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < R; i++) {
            sb.append(star.repeat(C)).append("\n");
        }

        System.out.println(sb);
    }
}