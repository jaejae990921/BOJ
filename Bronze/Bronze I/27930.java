import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] korea = { 'K', 'O', 'R', 'E', 'A' };
        char[] yonsei = { 'Y', 'O', 'N', 'S', 'E', 'I' };
        int k = 0, y = 0;

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == korea[k]) {
                k++;
                if (k == 5) {
                    sb.append("KOREA\n");
                    break;
                }
            }

            if (str.charAt(i) == yonsei[y]) {
                y++;
                if (y == 6) {
                    sb.append("YONSEI\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}