import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int H = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        sb.append((H * 60) + M);
        System.out.println(sb);
    }
}