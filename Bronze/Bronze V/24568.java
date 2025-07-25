import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int big = Integer.parseInt(br.readLine()) * 8;
        int small = Integer.parseInt(br.readLine()) * 3;

        sb.append(big + small - 28);
        System.out.println(sb);
    }
}