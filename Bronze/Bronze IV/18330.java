import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine()) + 60;

        if (k >= n) {
            cnt = n * 1500;
        } else {
            cnt = (k * 1500) + ((n - k) * 3000);
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}