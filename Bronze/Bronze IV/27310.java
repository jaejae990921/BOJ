import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        int totalLen = input.length();
        int colonCnt = input.length() - input.replaceAll(":", "").length();
        int underbarCnt = input.length() - input.replaceAll("_", "").length();

        sb.append(totalLen + colonCnt + underbarCnt * 5);
        System.out.println(sb);
    }
}