import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            sb.append("1");
        }

        for (int j = 0; j < k - 1; j++) {
            sb.append("0");
        }

        System.out.println(sb);
    }
}