import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char ch;

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch - 3 < 65) {
                sb.append((char) (ch + 23));
            } else {
                sb.append((char) (ch - 3));
            }
        }

        System.out.println(sb);
    }
}