import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            if (str[i].equals("S")) {
                cnt++;
            } else {
                i++;
                cnt++;
            }
        }

        if (cnt > n) {
            sb.append(n);
        } else {
            sb.append(cnt);
        }

        System.out.println(sb);
    }
}