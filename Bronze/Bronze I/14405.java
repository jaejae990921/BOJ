import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        boolean flag = str.replaceAll("pi|ka|chu", "").length() == 0;
        System.out.println(flag ? "YES" : "NO");
    }
}