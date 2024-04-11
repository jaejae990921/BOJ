import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double R = Double.parseDouble(br.readLine());

        sb.append(String.format("%.6f", Math.PI * R * R)).append("\n");
        sb.append(String.format("%.6f", 2 * R * R));

        System.out.println(sb);
    }
}