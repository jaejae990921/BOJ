import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char ch = ' ', rep = ' ';

        String A = br.readLine();
        String B = br.readLine().replaceAll(" ", "");

        for (int i = 0; i < B.length(); i++) {
            ch = B.charAt(i);
            rep = (char) (ch + 32);

            A = A.replace(ch, rep);
        }

        sb.append(A);
        System.out.println(sb);
    }
}