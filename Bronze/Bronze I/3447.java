import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            sb.append(replace(str)).append("\n");
        }

        System.out.println(sb);
    }

    public static String replace(String str) {
        String reStr;
        int len = 0, reLen = 0;

        while (true) {
            len = str.length();
            reStr = str.replaceAll("BUG", "");
            reLen = reStr.length();

            if (len == reLen) {
                break;
            }

            str = reStr;
        }

        return reStr;
    }
}