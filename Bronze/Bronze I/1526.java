import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 4; i--) {
            str = Integer.toString(i);

            if (cal(str)) {
                sb.append(str);
                break;
            }
        }

        System.out.println(sb);
    }

    public static boolean cal(String n) {
        boolean flag = true;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '4' && n.charAt(i) != '7') {
                flag = false;
                break;
            }
        }

        return flag;
    }
}