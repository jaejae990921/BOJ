import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int sum = 2;

        for (int i = 2; i <= N; i++) {
            sum += ((i / 2) + 1);
        }

        sb.append(sum);
        System.out.println(sb);
    }
}