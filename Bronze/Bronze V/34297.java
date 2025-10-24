import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        sb.append(M * C);
        System.out.println(sb);
    }
}