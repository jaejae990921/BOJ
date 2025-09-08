import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int S = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        sb.append(S <= F ? "high speed rail" : "flight");
        System.out.println(sb);
    }
}