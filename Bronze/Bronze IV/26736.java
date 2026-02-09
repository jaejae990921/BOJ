import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int aCnt = 0, bCnt = 0;

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                aCnt++;
            } else {
                bCnt++;
            }
        }

        sb.append(aCnt).append(" : ").append(bCnt);
        System.out.println(sb);
    }
}