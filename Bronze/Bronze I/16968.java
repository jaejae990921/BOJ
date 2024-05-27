import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        char ch;

        String str = br.readLine();
        cnt *= str.charAt(0) == 'c' ? 26 : 10;

        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch == str.charAt(i - 1)) {
                cnt *= ch == 'c' ? 25 : 9;
            } else {
                cnt *= ch == 'c' ? 26 : 10;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}