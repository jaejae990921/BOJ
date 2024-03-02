import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num, renum;
        String number;
        Boolean flag = false;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            num = Integer.parseInt(br.readLine());
            renum = reverse(num);

            number = Integer.toString(num + renum);

            flag = true;

            for (int j = 0; j < number.length() / 2; j++) {
                if (number.charAt(j) != number.charAt(number.length() - j - 1)) {
                    flag = false;
                    break;
                }
            }

            sb.append(flag ? "YES\n" : "NO\n");
        }

        System.out.println(sb);
    }

    public static int reverse(int n) {
        int result = 0;

        while (n != 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }

        return result;
    }
}