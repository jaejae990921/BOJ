import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "SciComLove";
        int cnt = 0;

        String S = br.readLine();

        for (int i = 0; i < 10; i++) {
            if (str.charAt(i) != S.charAt(i)) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}