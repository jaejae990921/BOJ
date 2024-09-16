import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            num = Integer.parseInt(br.readLine());

            for (int j = 2; j <= 64; j++) {
                if (ch(num, j)) {
                    sb.append(1 + "\n");
                    break;
                } else if (j == 64) {
                    sb.append(0 + "\n");
                }
            }
        }

        System.out.println(sb);
    }

    public static boolean ch(int num, int base) {
        String str = "";

        while (num > 0) {
            int mod = num % base;

            if (mod >= 10) {
                str = (char) (mod + 55) + str;
            } else {
                str = mod + str;
            }

            num /= base;
        }

        boolean flag = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}