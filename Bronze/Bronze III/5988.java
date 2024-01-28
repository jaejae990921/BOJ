import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            num = br.readLine();

            sb.append(num.charAt(num.length() - 1) % 2 == 0 ? "even" : "odd").append("\n");
        }

        System.out.println(sb);
    }
}