import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int zeroCnt = 0, oneCnt = 0;

        String str = br.readLine();

        if (str.charAt(0) == '0') {
            zeroCnt++;
        } else {
            oneCnt++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (str.charAt(i) == '0') {
                    zeroCnt++;
                } else {
                    oneCnt++;
                }
            }
        }

        sb.append(Math.min(zeroCnt, oneCnt));
        System.out.println(sb);
    }
}