import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        char ch;
        int cnt;

        while ((str = br.readLine()) != null) {
            cnt = 0;
            ch = str.charAt(0);
            if (ch == '#') {
                break;
            }
            str = str.substring(2).toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    cnt++;
                }
            }

            System.out.println(ch + " " + cnt);
        }
    }
}