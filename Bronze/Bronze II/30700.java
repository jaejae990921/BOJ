import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String korea = "KOREA";
        int cnt = 0, idx = 0;

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == korea.charAt(idx)) {
                idx++;
                cnt++;

                if (idx == 5) {
                    idx = 0;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}