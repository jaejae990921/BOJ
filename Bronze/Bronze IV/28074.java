import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        boolean flag = (str.contains("M") && str.contains("O") && str.contains("B") && str.contains("I")
                && str.contains("S"));

        sb.append(flag ? "YES" : "NO");
        System.out.println(sb);
    }
}