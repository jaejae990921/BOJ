import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[100];
        boolean flag;
        int k;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            k = Integer.parseInt(br.readLine());
            flag = false;

            for (int j = 0; j < k; j++) {
                arr[j] = br.readLine();
            }

            for (int l = 0; l < k; l++) {
                for (int m = 0; m < k; m++) {
                    if (l == m) {
                        continue;
                    }

                    if (isPalindrome(arr[l] + arr[m])) {
                        sb.append(arr[l]).append("").append(arr[m]).append("\n");
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    break;
                }
            }

            if (!flag) {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isPalindrome(String str) {
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}