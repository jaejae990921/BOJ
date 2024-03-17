import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int cnt = 1, max = 1;

        for (int i = 0; i < 3; i++) {
            str = br.readLine();

            cnt = 1;
            max = 1;

            for (int j = 1; j < 8; j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    cnt = 1;
                }
            }

            sb.append(max + "\n");
        }

        System.out.println(sb);
    }
}