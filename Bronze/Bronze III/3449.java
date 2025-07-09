import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a, b;
        int cnt;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            a = br.readLine();
            b = br.readLine();
            cnt = 0;

            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j)) {
                    cnt++;
                }
            }

            sb.append("Hamming distance is ").append(cnt).append(".\n");
        }

        System.out.println(sb);
    }
}