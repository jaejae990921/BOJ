import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());

        sb.append(w * l);
        System.out.println(sb);
    }
}