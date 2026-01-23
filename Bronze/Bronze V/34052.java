import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 300, input = 0;

        for (int i = 0; i < 4; i++) {
            input = Integer.parseInt(br.readLine());
            sum += input;
        }

        sb.append(sum <= 1800 ? "Yes" : "No");
        System.out.println(sb);
    }
}
