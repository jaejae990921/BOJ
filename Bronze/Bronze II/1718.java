import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int p, c, ch;

        String plain = br.readLine();
        String cipher = br.readLine();

        while (cipher.length() < plain.length()) {
            cipher += cipher;
        }

        for (int i = 0; i < plain.length(); i++) {
            if (plain.charAt(i) == ' ') {
                sb.append(' ');
            } else {
                p = plain.charAt(i) - 'a';
                c = cipher.charAt(i) - 'a';

                ch = p - c;

                if (ch <= 0) {
                    ch += 26;
                } else {
                    ch %= 26;
                }

                sb.append((char) (ch + 'a' - 1));
            }
        }

        System.out.println(sb);
    }
}