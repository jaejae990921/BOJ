import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();

        while (true) {
            if (str.contains("PS4") || str.contains("PS5")) {
                str = str.replaceAll("PS[45]", "PS");
            } else {
                break;
            }
        }

        sb.append(str);
        System.out.println(sb);
    }
}