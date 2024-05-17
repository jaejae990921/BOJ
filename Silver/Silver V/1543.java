import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        String str = br.readLine();
        String find = br.readLine();

        String change = str.replaceAll(find, "!");

        for (int i = 0; i < change.length(); i++) {
            if (change.charAt(i) == '!') {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}
