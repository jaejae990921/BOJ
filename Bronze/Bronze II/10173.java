import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while (!(str = br.readLine()).equals("EOI")) {
            if (str.toLowerCase().contains("nemo")) {
                sb.append("Found\n");
            } else {
                sb.append("Missing\n");
            }
        }

        System.out.println(sb);
    }
}