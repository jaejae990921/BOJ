import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        int N = Integer.parseInt(br.readLine());
        String magnet = br.readLine();

        for (int i = 0; i < magnet.length() - 1; i++) {
            if (magnet.charAt(i) == magnet.charAt(i + 1)) {
                flag = false;
                break;
            }
        }

        sb.append(flag ? "Yes" : "No");
        System.out.println(sb);
    }
}