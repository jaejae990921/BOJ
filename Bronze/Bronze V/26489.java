import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int cnt = 0;

        while ((input = br.readLine()) != null) {
            cnt++;
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}