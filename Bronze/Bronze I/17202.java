import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "", temp;

        String A = br.readLine();
        String B = br.readLine();

        for (int i = 0; i < 8; i++) {
            str += A.charAt(i);
            str += B.charAt(i);
        }

        while (str.length() > 2) {
            temp = "";
            for (int i = 0; i < str.length() - 1; i++) {
                temp += (str.charAt(i) - '0' + str.charAt(i + 1) - '0') % 10;
            }
            str = temp;
        }

        sb.append(str);
        System.out.println(sb);
    }
}