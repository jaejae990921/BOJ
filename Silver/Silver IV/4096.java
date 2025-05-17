import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int cnt = 0, len = 0;

        while ((input = br.readLine()) != null) {
            if (input.equals("0")) {
                break;
            }

            len = input.length();

            while (true) {
                if (isPalindrome(input)) {
                    break;
                } else {
                    input = makeNumber(input, len);
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
            cnt = 0;
        }

        System.out.print(sb);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static String makeNumber(String str, int len) {
        int num = Integer.parseInt(str) + 1;
        int numLen = String.valueOf(num).length();
        String returnStr = String.valueOf(num);

        for (int i = 0; i < len - numLen; i++) {
            returnStr = "0" + returnStr;
        }

        return returnStr;
    }
}