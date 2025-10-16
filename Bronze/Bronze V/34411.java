import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        sb.append(m * n);
        System.out.println(sb);
    }
}