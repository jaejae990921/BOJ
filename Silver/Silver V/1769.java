import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0, sum = 0;

        String str = br.readLine();

        while (true) {
            if (str.length() == 1) {
                break;
            }

            sum = 0;

            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }

            str = Integer.toString(sum);
            cnt++;
        }

        sb.append(cnt).append("\n").append(Integer.parseInt(str) % 3 == 0 ? "YES" : "NO");
        System.out.println(sb);
    }
}