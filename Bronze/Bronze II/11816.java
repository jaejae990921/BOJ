import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String num = br.readLine();

        if (num.startsWith("0x")) {
            sb.append(Integer.parseInt(num.substring(2), 16));
        } else if (num.startsWith("0")) {
            sb.append(Integer.parseInt(num, 8));
        } else {
            sb.append(num);
        }

        System.out.println(sb);
    }
}