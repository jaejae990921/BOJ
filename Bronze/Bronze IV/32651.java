import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N % 2024 == 0 && N < 100000) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        System.out.println(sb);
    }
}