import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] ucpc = { 'U', 'C', 'P', 'C' };
        boolean flag = false;
        int idx = 0;

        String str = br.readLine().trim();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ucpc[idx]) {
                idx++;
            }

            if (idx == 4) {
                flag = true;
                break;
            }
        }

        sb.append(flag ? "I love UCPC" : "I hate UCPC");
        System.out.println(sb);
    }
}