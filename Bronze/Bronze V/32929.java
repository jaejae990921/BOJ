import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String uos = "UOS";

        int x = Integer.parseInt(br.readLine());
        int idx = (x - 1) % 3;

        sb.append(uos.charAt(idx));
        System.out.println(sb);
    }
}