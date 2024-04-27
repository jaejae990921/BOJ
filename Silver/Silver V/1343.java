import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        str = str.replaceAll("XXXX", "AAAA");
        str = str.replaceAll("XX", "BB");

        sb.append(str.contains("X") ? -1 : str);
        System.out.println(sb);
    }
}