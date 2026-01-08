import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());

        if (x + 2 >= 8) {
            sb.append("Success!");
        } else {
            sb.append("Oh My God!");
        }

        System.out.println(sb);
    }
}