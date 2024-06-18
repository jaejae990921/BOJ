import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int joiCnt = 0, ioiCnt = 0;

        String str = br.readLine();

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'J' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') {
                joiCnt++;
            } else if (str.charAt(i) == 'I' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') {
                ioiCnt++;
            }
        }

        sb.append(joiCnt).append('\n').append(ioiCnt);
        System.out.println(sb);
    }
}