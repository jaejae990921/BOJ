import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        String K = br.readLine();

        S = S.replaceAll("[0-9]", "");

        sb.append(S.contains(K) ? 1 : 0);
        System.out.println(sb);
    }
}