import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int len = str.length();

        int a = str.replaceAll("[aeiou]", "").length();
        int b = str.replaceAll("[aeiouy]", "").length();

        sb.append(len - a).append(" ").append(len - b);
        System.out.println(sb);
    }
}