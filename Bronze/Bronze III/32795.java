import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String a = "", b = "";
        boolean flag = false;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            a = br.readLine();
            b = br.readLine();

            flag = true;

            for (int j = 0; j < b.length(); j++) {
                if (!a.contains(b.charAt(j) + "")) {
                    flag = false;
                    break;
                }
            }

            sb.append(flag ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }
}