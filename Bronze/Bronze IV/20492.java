import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int prize = Integer.parseInt(br.readLine());
        int a = (int) (prize - (prize * 0.22));
        int b = (int) (prize - (prize * 0.2 * 0.22));

        sb.append(a).append(" ").append(b);
        System.out.println(sb);
    }
}